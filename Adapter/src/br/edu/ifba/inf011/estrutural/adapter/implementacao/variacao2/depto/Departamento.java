package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2.depto;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private final String nomeSetor;
    private final List<Departamento> subDepartamentos;

    public Departamento(String nomeSetor) {
        this.nomeSetor = nomeSetor;
        this.subDepartamentos = new ArrayList<>();
    }

    public void adicionarSubDepartamento(Departamento subDept) {
        this.subDepartamentos.add(subDept);
    }

    public String getNomeSetor() {
        return this.nomeSetor;
    }

    public List<Departamento> getSubDepartamentos() {
        return this.subDepartamentos;
    }
}