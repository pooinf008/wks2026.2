package br.edu.ifba.inf011.model;

public interface TabelaPrecos {
	public double getPrecoCPUGHzBase();
	public double getMultiplicadorCPUMemoryOptimized();
	public double getPrecoRamGBBase();
	public double getPrecoRamGBECC();
	public double getPrecoStorageHDD();
	public double getPrecoStorageSSD();
	public double getPrecoStorageNVMe();
	public double getPrecoStorageIOPS();	
}
