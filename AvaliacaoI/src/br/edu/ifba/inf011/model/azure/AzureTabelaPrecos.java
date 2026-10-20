package br.edu.ifba.inf011.model.azure;

import br.edu.ifba.inf011.model.TabelaPrecos;

public class AzureTabelaPrecos implements TabelaPrecos {
    @Override 
    public double getPrecoCPUGHzBase() {
    	return 12.00; 
    } 
    
    @Override 
    public double getMultiplicadorCPUMemoryOptimized() {
    	return 1.50; 
    }
    
    @Override 
    public double getPrecoRamGBBase() {
    	return 2.00; 
    }
    
    @Override 
    public double getPrecoRamGBECC() {
    	return 6.00; 
    }
    
    @Override 
    public double getPrecoStorageHDD() {
    	return 0.08; 
    }
    
    @Override 
    public double getPrecoStorageSSD() {
    	return 0.20; 
    }
    
    @Override 
    public double getPrecoStorageNVMe() {
    	return 0.45; 
    }
    
    @Override 
    public double getPrecoStorageIOPS() {
    	return 0.0; 
    }
}