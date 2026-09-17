package br.edu.ifba.inf011.criacional.fm.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Creator (GoF)
 * Declara o Factory Method (createDocument) e gerencia os produtos sem se acoplar às suas classes concretas.
 */
public abstract class Application {

    private final List<Document> docs = new ArrayList<>();

    /**
     * FACTORY METHOD (GoF)
     * Método abstrato a ser sobrescrito pelas subclasses para instanciar o Produto Concreto.
     */
    public abstract Document createDocument();

    /**
     * Operação do Framework que consome o produto através do Factory Method.
     */
    public void newDocument() {
        System.out.println("\nApplication: Executando rotina 'newDocument'...");
        Document doc = this.createDocument(); // Chamada ao Factory Method
        this.docs.add(doc);
        doc.open();
    }

    public void openDocument(Document doc) {
        if (doc != null) {
            doc.open();
        }
    }

    public List<Document> getDocs() {
        return this.docs;
    }
}
