package br.edu.ifba.inf011.model.builder;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.IAASScript;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;

public class IAASScriptBuilder implements CloudBuilder {
    
    private IAASScript script;
    private int cpuCount = 0;
    private int memoryCount = 0;
    private int storageCount = 0;

    public IAASScriptBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.script = new IAASScript();
        this.cpuCount = 0;
        this.memoryCount = 0;
        this.storageCount = 0;
    }

    @Override
    public void addCPU(CPU cpu) {
        cpuCount++;
        String block = String.format(
            "resource \"cloud_compute_instance\" \"cpu_node_%d\" {\n" +
            "  type       = \"%s\"\n" +
            "  clock_ghz  = %.1f\n" +
            "}", 
            cpuCount, cpu.getCPU().name(), cpu.getClockSpeedGhz()
        );
        script.appendResource(block);
    }

    @Override
    public void addMemoria(Memoria memoria) {
        memoryCount++;
        String block = String.format(
            "resource \"cloud_memory_block\" \"ram_node_%d\" {\n" +
            "  size_gb    = %d\n" +
            "  tech       = \"%s\"\n" +
            "}", 
            memoryCount, memoria.getRamGb(), memoria.getTipo().name()
        );
        script.appendResource(block);
    }

    @Override
    public void addStorage(Storage storage) {
        storageCount++;
        String block = String.format(
            "resource \"cloud_storage_volume\" \"disk_node_%d\" {\n" +
            "  capacity_gb = %d\n" +
            "  disk_type   = \"%s\"\n" +
            "  iops        = %d\n" +
            "}", 
            storageCount, storage.getCapacity(), storage.getTipo().name(), storage.getIOPS()
        );
        script.appendResource(block);
    }

    public IAASScript getResult() {
        return this.script;
    }
}