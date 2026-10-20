package br.edu.ifba.inf011.model.aws;

import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.TipoMemoria;

public class AwsMemoria implements Memoria {

    private int ramGb;
    private TipoMemoria tipo;

    public AwsMemoria(int ramGb, TipoMemoria tipo) {
        this.ramGb = ramGb;
        this.tipo = tipo;
    }

    @Override
    public int getRamGb() {
        return this.ramGb;
    }

    @Override
    public TipoMemoria getTipo() {
        return this.tipo;
    }

    @Override
    public void allocate() {
        System.out.println(String.format(
            "AWS RAM Allocation: Bloco de memória de %dGB [%s] provisionado na zona de disponibilidade.", 
            this.ramGb, this.tipo.getDescricao()
        ));
    }
}