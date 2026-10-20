package br.edu.ifba.inf011.model;

public interface Memoria {
    public int getRamGb();
    public TipoMemoria getTipo();
    public void allocate();
}