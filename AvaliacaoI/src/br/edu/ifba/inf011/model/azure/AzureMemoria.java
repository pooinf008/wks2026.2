package br.edu.ifba.inf011.model.azure;

import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.TipoMemoria;

public class AzureMemoria implements Memoria {
    private int ramGb;
    private TipoMemoria tipo;

    public AzureMemoria(int ramGb, TipoMemoria tipo) {
        this.ramGb = ramGb;
        this.tipo = tipo;
    }

    @Override 
    public int getRamGb() { return this.ramGb; }
    
    @Override 
    public TipoMemoria getTipo() { return this.tipo; }

    @Override
    public void allocate() {
        System.out.println(String.format(
            "AZURE RAM Allocation: Bloco de memória de %dGB [%s] provisionado no Host Dedicado.", 
            this.ramGb, this.tipo.name()
        ));
    }
}