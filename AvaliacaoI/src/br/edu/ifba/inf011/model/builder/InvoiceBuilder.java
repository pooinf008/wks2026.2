package br.edu.ifba.inf011.model.builder;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Invoice;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;

public class InvoiceBuilder implements CloudBuilder {
    
    private Invoice fatura;
    private TabelaPrecos tabelaPrecos; 

    public InvoiceBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.fatura = new Invoice();
    }

    @Override
    public void withTabelaPrecos(TabelaPrecos tabela) {
        this.tabelaPrecos = tabela;
    }

    @Override
    public void addCPU(CPU cpu) {
        double precoBase = cpu.getClockSpeedGhz() * tabelaPrecos.getPrecoCPUGHzBase();
        if (cpu.getCPU() == TipoCPU.MEMORY_OPTIMIZED)
            precoBase *= tabelaPrecos.getMultiplicadorCPUMemoryOptimized();
        String desc = String.format("Compute: %s (%.1f GHz)", cpu.getCPU().name(), cpu.getClockSpeedGhz());
        this.fatura.adicionarItem(desc, precoBase);
    }

    @Override
    public void addMemoria(Memoria memoria) {
        double precoGb = (memoria.getTipo() == TipoMemoria.ECC) 
                         ? tabelaPrecos.getPrecoRamGBECC() 
                         : tabelaPrecos.getPrecoRamGBBase();
        
        double custoTotal = memoria.getRamGb() * precoGb;
        String desc = String.format("Memória: %dGB [%s]", memoria.getRamGb(), memoria.getTipo().name());
        this.fatura.adicionarItem(desc, custoTotal);
    }

    @Override
    public void addStorage(Storage storage) {
        double taxaGb = switch (storage.getTipo()) {
            case HDD -> tabelaPrecos.getPrecoStorageHDD();
            case SSD -> tabelaPrecos.getPrecoStorageSSD();
            case NVME -> tabelaPrecos.getPrecoStorageNVMe();
        };
        
        double custoCapacidade = storage.getCapacity() * taxaGb;
        double custoIops = storage.getIOPS() * tabelaPrecos.getPrecoStorageIOPS();
        
        String desc = String.format("Storage: %dGB %s (%d IOPS)", storage.getCapacity(), storage.getTipo().name(), storage.getIOPS());
        this.fatura.adicionarItem(desc, custoCapacidade + custoIops);
    }

    public Invoice getResult() {
        return this.fatura;
    }
}