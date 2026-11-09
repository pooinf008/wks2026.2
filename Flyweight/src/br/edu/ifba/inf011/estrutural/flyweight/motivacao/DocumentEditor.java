package br.edu.ifba.inf011.estrutural.flyweight.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Client (GoF)
 * Editor de documentos que demonstra o cenário motivacional do padrão Flyweight.
 * 
 * Cria e monta um documento de texto com linhas e caracteres obtidos da GlyphFactory.
 * Configura fontes no GlyphContext e renderiza o documento na Window.
 * 
 * Evidencia a economia de memória: um documento contendo centenas ou milhares de
 * ocorrências de caracteres aloca apenas uma pequena quantidade de instâncias
 * compartilhadas de Character na memória.
 */
public class DocumentEditor {

    private final GlyphFactory factory = GlyphFactory.instance();
    private List<Row> document = new ArrayList<Row>();

    public void run() {
        System.out.println("=== Padrão GoF: Flyweight (Motivação - Editor de Documentos / Lexi) ===\n");

        String line1Text = "Padroes de Projetos";
        String line2Text = "Solucoes Reutilizaveis de Software Orientados a Objetos";
        String line3Text = "Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides";

        int totalCaractereOcorrencias = line1Text.length() + line2Text.length();

        this.document.add(this.toRow(line1Text));
        this.document.add(this.toRow(line2Text));
        this.document.add(this.toRow(line3Text));

        System.out.println("--- Renderizando documento na janela:");
        for (int iCont = 0; iCont < this.document.size(); iCont++)
        	this.document.get(iCont).draw(iCont, 0);
        
        

        System.out.println("\n--- Análise de Economia de Memória (Flyweight):");
        System.out.println("Total de caracteres no texto do documento : " + totalCaractereOcorrencias);
        System.out.println("Total de instâncias Character na memória   : " + this.factory.getCharacterCount());
        System.out.printf("Redução de instâncias de objetos folha      : %.1f%%%n",
                (1.0 - ((double) this.factory.getCharacterCount() / totalCaractereOcorrencias)) * 100);
    }

	private Row toRow(String line1Text) {
		Row row = this.factory.createRow();
        for (int i = 0; i < line1Text.length(); i++) {
            char c = line1Text.charAt(i);
            row.add(this.factory.createCharacter(c));
        }
        return row;
	}

    public static void main(String[] args) {
        new DocumentEditor().run();
    }
}
