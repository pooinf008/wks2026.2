package br.edu.ifba.inf011.model.util;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;

public class Elemento2InvoiceItem {
	
	private TabelaPrecos tabela;
	
	
	public record InvoiceItem(String descricao, double precoBase) {
		
	}
	
	public Elemento2InvoiceItem(TabelaPrecos tabela) {
		this.tabela = tabela;
	}
	
    public InvoiceItem cpu2Fatura(CPU cpu) {
        double precoBase = cpu.getClockSpeedGhz() * this.tabela.getPrecoCPUGHzBase();
        if (cpu.getCPU() == TipoCPU.MEMORY_OPTIMIZED)
            precoBase *= this.tabela.getMultiplicadorCPUMemoryOptimized();
        String desc = String.format("Compute: %s (%.1f GHz)", cpu.getCPU().name(), cpu.getClockSpeedGhz());
        return new InvoiceItem(desc, precoBase);
    }
    
    public InvoiceItem memoria2Fatura(Memoria memoria) {
        double precoGb = (memoria.getTipo() == TipoMemoria.ECC) 
                         ? this.tabela.getPrecoRamGBECC() 
                         : this.tabela.getPrecoRamGBBase();
        
        double custoTotal = memoria.getRamGb() * precoGb;
        String desc = String.format("Memória: %dGB [%s]", memoria.getRamGb(), memoria.getTipo().name());
        return new InvoiceItem(desc, custoTotal);
    }
    
    public InvoiceItem storage2Fatura(Storage storage) {
        double taxaGb = switch (storage.getTipo()) {
	        case HDD -> this.tabela.getPrecoStorageHDD();
	        case SSD -> this.tabela.getPrecoStorageSSD();
	        case NVME -> this.tabela.getPrecoStorageNVMe();
        };
	    double custoCapacidade = storage.getCapacity() * taxaGb;
	    double custoIops = storage.getIOPS() * this.tabela.getPrecoStorageIOPS();
	    String desc = String.format("Storage: %dGB %s (%d IOPS)", storage.getCapacity(), storage.getTipo().name(), storage.getIOPS());

	    return new InvoiceItem(desc, custoCapacidade + custoIops);
    }    

}
