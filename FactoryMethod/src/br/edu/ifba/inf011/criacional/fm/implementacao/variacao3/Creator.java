package br.edu.ifba.inf011.criacional.fm.implementacao.variacao3;

/**
 * PARTICIPANTE: Creator (GoF - Implementação: Tópicos Específicos da Linguagem - Armadilha no Construtor)
 *
 * ANTI-PADRÃO / ARMADILHA:
 * O construtor da classe base invoca o Factory Method polimórfico (factoryMethod()).
 * No Java, isso chamará o método da subclasse (ConcreteCreator), MAS os atributos da subclasse
 * AINDA NÃO FORAM INICIALIZADOS, pois o construtor pai roda ANTES dos inicializadores da subclasse!
 */
public abstract class Creator {

    public Creator() {
        System.out.println("Creator [Construtor Pai]: Iniciando construtor pai...");
        System.out.println("Creator [Construtor Pai]: Invocando factoryMethod() polimórfico...");
        Product p = this.factoryMethod();
        p.usar();
    }

    protected abstract Product factoryMethod();
}
