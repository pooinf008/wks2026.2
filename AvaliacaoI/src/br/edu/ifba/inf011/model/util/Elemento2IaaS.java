package br.edu.ifba.inf011.model.util;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;

public class Elemento2IaaS {
	
	private int cpuCount;
	private int memoryCount;
	private int storageCount;
	
	public Elemento2IaaS() {
		this.cpuCount = 0;
		this.memoryCount = 0;
		this.storageCount = 0;
	}
	
    public String cpu2IaaS(CPU cpu) {
        this.cpuCount++;
        String block = String.format(
            "resource \"cloud_compute_instance\" \"cpu_node_%d\" {\n" +
            "  type       = \"%s\"\n" +
            "  clock_ghz  = %.1f\n" +
            "}", 
            cpuCount, cpu.getCPU().name(), cpu.getClockSpeedGhz()
        );
        return block;
    }

    public String memoria2IaaS(Memoria memoria) {
    	this.memoryCount++;
        String block = String.format(
            "resource \"cloud_memory_block\" \"ram_node_%d\" {\n" +
            "  size_gb    = %d\n" +
            "  tech       = \"%s\"\n" +
            "}", 
            memoryCount, memoria.getRamGb(), memoria.getTipo().name()
        );
        return block;
    }

    public String storage2IaaS(Storage storage) {
        this.storageCount++;
        String block = String.format(
            "resource \"cloud_storage_volume\" \"disk_node_%d\" {\n" +
            "  capacity_gb = %d\n" +
            "  disk_type   = \"%s\"\n" +
            "  iops        = %d\n" +
            "}", 
            storageCount, storage.getCapacity(), storage.getTipo().name(), storage.getIOPS()
        );
        return block;
    }	

}
