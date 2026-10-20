package br.edu.ifba.inf011.model.builder;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;

public interface CloudBuilder {
    public void reset();
    public void addCPU(CPU cpu);
    public void addMemoria(Memoria memoria);
    public void addStorage(Storage storage);
    public default void withTabelaPrecos(TabelaPrecos tabela) {}; 
}