package br.edu.ifba.inf011.criacional.fm.motivacao;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Implementa a interface Product para o cenário de aplicação do livro GoF.
 */
public class MyDocument implements Document {

    public MyDocument() {
        System.out.println("MyDocument: Nova instância de documento criada.");
    }

    @Override
    public void open() {
        System.out.println("MyDocument: Abrindo o documento na tela.");
    }

    @Override
    public void close() {
        System.out.println("MyDocument: Fechando o documento.");
    }

    @Override
    public void save() {
        System.out.println("MyDocument: Salvando o conteúdo no disco.");
    }

    @Override
    public void revert() {
        System.out.println("MyDocument: Revertendo alterações não salvas.");
    }
}
