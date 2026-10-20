package br.edu.ifba.inf011.model.aws;

import br.edu.ifba.inf011.model.TabelaPrecos;

public class AwsTabelaPrecos implements TabelaPrecos {
	
    @Override 
    public double getPrecoCPUGHzBase() {
    	return 15.00; 
    }
    
    @Override 
    public double getMultiplicadorCPUMemoryOptimized() {
    	return 1.20; 
    }
    
    @Override 
    public double getPrecoRamGBBase() {
    	return 2.50; 
    }
    
    @Override 
    public double getPrecoRamGBECC() {
    	return 5.00;
    }
    
    @Override 
    public double getPrecoStorageHDD() { 
    	return 0.10; 
    }
    
    @Override 
    public double getPrecoStorageSSD(){
    	return 0.25; 
    }
    
    @Override 
    public double getPrecoStorageNVMe() {
    	return 0.40;
    }
    
    @Override 
    public double getPrecoStorageIOPS() {
    	return 0.001;
    }
}
