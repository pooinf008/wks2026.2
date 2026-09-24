package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao3;

/**
 * PARTICIPANTE: Prototype (GoF)
 * Declara a interface para clonagem e inicialização de objetos protótipo.
 */
public interface Prototype extends Cloneable {

    /**
     * Operação principal do padrão Prototype: clona a si mesmo.
     */
    Prototype clone();

    /**
     * Operação de inicialização para redefinir/configurar o estado do objeto recém-clonado
     * com parâmetros fornecidos pelo cliente (GoF Implementação - Iniciar Clones).
     */
    void initialize(String name, int value);

    /**
     * Exibe o estado e propriedades atuais do objeto.
     */
    void execute();
}
