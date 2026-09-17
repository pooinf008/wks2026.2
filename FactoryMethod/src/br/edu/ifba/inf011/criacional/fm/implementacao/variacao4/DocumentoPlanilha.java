package br.edu.ifba.inf011.criacional.fm.implementacao.variacao4;

/**
 * PARTICIPANTE: ConcreteProduct B (GoF)
 */
public class DocumentoPlanilha implements Documento {

    public DocumentoPlanilha() {
        System.out.println("DocumentoPlanilha: Instanciado com sucesso.");
    }

    @Override
    public void abrir() {
        System.out.println("DocumentoPlanilha: Abrindo leitor de planilhas.");
    }
}
