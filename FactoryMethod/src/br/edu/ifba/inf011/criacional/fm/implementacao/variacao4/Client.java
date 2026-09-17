package br.edu.ifba.inf011.criacional.fm.implementacao.variacao4;

/**
 * Executável para teste da utilização de Generics/Templates no Factory Method (GoF - Variedade 4).
 * Evita a criação de subclasses de fábrica utilizando referências de construtor (Supplier).
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Implementação - Evitando Subclasses com Generics/Templates) ===");

        FabricaGenerica<DocumentoTexto> fabTexto = new FabricaGenerica<DocumentoTexto>(() -> new DocumentoTexto());
        DocumentoTexto docTexto = fabTexto.fabricar();
        docTexto.abrir();

        FabricaGenerica<DocumentoPlanilha> fabPlanilha = new FabricaGenerica<DocumentoPlanilha>(() -> new DocumentoPlanilha());
        DocumentoPlanilha docPlanilha = fabPlanilha.fabricar();
        docPlanilha.abrir();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
