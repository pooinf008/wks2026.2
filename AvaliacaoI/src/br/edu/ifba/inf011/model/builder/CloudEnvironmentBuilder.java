package br.edu.ifba.inf011.model.builder;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.CloudEnvironment;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;

public class CloudEnvironmentBuilder implements CloudBuilder {
    
    private List<CPU> computeUnits;
    private List<Memoria> memoryUnits;
    private List<Storage> storageUnits;

    public CloudEnvironmentBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computeUnits = new ArrayList<>();
        this.memoryUnits = new ArrayList<>();
        this.storageUnits = new ArrayList<>();
    }

    @Override
    public void addCPU(CPU cpu) {
        this.computeUnits.add(cpu);
    }

    @Override
    public void addMemoria(Memoria memoria) {
        this.memoryUnits.add(memoria);
    }

    @Override
    public void addStorage(Storage storage) {
        this.storageUnits.add(storage);
    }

    public CloudEnvironment getResult() {
        return new CloudEnvironment(this.computeUnits, this.memoryUnits, this.storageUnits);
    }
}