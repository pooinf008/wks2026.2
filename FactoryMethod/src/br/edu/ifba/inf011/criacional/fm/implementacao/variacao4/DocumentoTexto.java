package br.edu.ifba.inf011.criacional.fm.implementacao.variacao4;

/**
 * PARTICIPANTE: ConcreteProduct A (GoF)
 */
public class DocumentoTexto implements Documento {

    public DocumentoTexto() {
        System.out.println("DocumentoTexto: Instanciado com sucesso.");
    }

    @Override
    public void abrir() {
        System.out.println("DocumentoTexto: Abrindo editor de texto.");
    }
}
