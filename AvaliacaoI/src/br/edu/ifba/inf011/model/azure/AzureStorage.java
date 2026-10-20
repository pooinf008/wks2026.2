package br.edu.ifba.inf011.model.azure;

import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TipoStorage;

public class AzureStorage implements Storage {
    private int capacity;
    private TipoStorage tipo;
    private int iops;
    
    // Atributo específico da família Azure (Managed Disk)
    private String managedDiskId;

    public AzureStorage(int capacity, TipoStorage tipo, int iops) {
        this.capacity = capacity;
        this.tipo = tipo;
        this.iops = iops;
        this.managedDiskId = "disk-az-" + (int)(Math.random() * 10000);
    }

    @Override 
    public int getCapacity() { return this.capacity; }
    
    @Override 
    public TipoStorage getTipo() { return this.tipo; }
    
    @Override 
    public int getIOPS() { return this.iops; }

    @Override
    public void attach() {
        System.out.println(String.format(
            "AZURE ManagedDisk [%s]: Disco anexado. Capacidade: %dGB | Tipo: %s | IOPS provisionados: %d", 
            this.managedDiskId, this.capacity, this.tipo.name(), this.iops
        ));
    }
}
