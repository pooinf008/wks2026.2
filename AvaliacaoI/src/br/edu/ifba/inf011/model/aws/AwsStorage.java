package br.edu.ifba.inf011.model.aws;

import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TipoStorage;

public class AwsStorage implements Storage {

    private int capacity;
    private TipoStorage tipo;
    private int iops;
    
    // Atributo específico do domínio AWS (Elastic Block Store)
    private String ebsVolumeId;

    public AwsStorage(int capacity, TipoStorage tipo, int iops) {
        this.capacity = capacity;
        this.tipo = tipo;
        this.iops = iops;
        this.ebsVolumeId = "vol-" + (int)(Math.random() * 100000000);
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public TipoStorage getTipo() {
        return this.tipo;
    }

    @Override
    public int getIOPS() {
        return this.iops;
    }

    @Override
    public void attach() {
        System.out.println(String.format(
            "AWS EBS Volume [%s]: Disco anexado. Capacidade: %dGB | Tipo: %s | IOPS provisionados: %d", 
            this.ebsVolumeId, this.capacity, this.tipo.getDescricao(), this.iops
        ));
    }
}
