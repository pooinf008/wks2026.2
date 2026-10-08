package br.edu.ifba.inf011.criacional.singleton.motivacao;

/**
 * Representa um trabalho de impressão submetido ao Spooler de Impressão.
 */
public class PrintJob {
    private final String id;
    private final String documentName;
    private final int pageCount;

    public PrintJob(String id, String documentName, int pageCount) {
        this.id = id;
        this.documentName = documentName;
        this.pageCount = pageCount;
    }

    public String getId() {
        return id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "PrintJob [ID=" + id + ", Documento='" + documentName + "', Páginas=" + pageCount + "]";
    }
}
