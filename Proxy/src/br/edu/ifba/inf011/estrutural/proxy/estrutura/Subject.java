package br.edu.ifba.inf011.estrutural.proxy.estrutura;

/**
 * PARTICIPANTE: Subject (GoF)
 * Define uma interface comum para RealSubject e Proxy, de maneira que
 * um Proxy possa ser usado em qualquer lugar em que um RealSubject é esperado.
 */
public interface Subject {
    public void request();
}
