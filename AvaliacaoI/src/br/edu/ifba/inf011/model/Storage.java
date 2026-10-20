package br.edu.ifba.inf011.model;

public interface Storage {
	public int getCapacity();
	public TipoStorage getTipo();
	public int getIOPS();
    public void attach();	
}
