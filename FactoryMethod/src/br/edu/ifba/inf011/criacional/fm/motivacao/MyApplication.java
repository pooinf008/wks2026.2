package br.edu.ifba.inf011.criacional.fm.motivacao;

/**
 * PARTICIPANTE: ConcreteCreator (GoF)
 * Sobrescreve o Factory Method para retornar uma instância de ConcreteProduct (MyDocument).
 */
public class MyApplication extends Application {

    @Override
    public Document createDocument() {
        return new MyDocument();
    }
}
