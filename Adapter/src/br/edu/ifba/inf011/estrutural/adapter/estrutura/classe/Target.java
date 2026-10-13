package br.edu.ifba.inf011.estrutural.adapter.estrutura.classe;

/**
 * PARTICIPANTE: Target (GoF)
 * Define a interface específica do domínio que o Client usa.
 * Em Java é uma interface, permitindo ao Adapter herdar de Adaptee e implementar Target
 * (substituto da herança múltipla do C++ usada no GoF).
 */
public interface Target {
    void request();
}
