package br.edu.ifba.inf011.estrutural.flyweight.variacao1;

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

    private List<CharacterGlyph> noFly = new ArrayList<CharacterGlyph>();
    private List<CharacterGlyph> fly = new ArrayList<CharacterGlyph>();

    public void run() {
        System.out.println("=== Padrão GoF: Flyweight (Motivação - Editor de Documentos / Lexi) ===\n");

        String line1Text = "Padroes de Projetos";
        String line2Text = "Solucoes Reutilizaveis de Software Orientados a Objetos";

        System.out.println("--- Renderizando documento na janela:");
        for (int iCont = 0; iCont < line1Text.length(); iCont++) {
        	fly.add(new CharacterClient(0, iCont, line1Text.charAt(iCont)));
        	noFly.add(new CharacterNoFlyweight(0, iCont, line1Text.charAt(iCont)));
        }	

        for (int iCont = 0; iCont < line2Text.length(); iCont++) {
        	fly.add(new CharacterClient(0, iCont, line2Text.charAt(iCont)));
        	noFly.add(new CharacterNoFlyweight(0, iCont, line2Text.charAt(iCont)));
        }	
        
        

        System.out.println("\n--- Análise de Economia de Memória (Flyweight):");
        System.out.println("Total de caracteres no texto do documento : " + noFly.size());
        System.out.println("Total de instâncias Character na memória   : " + CharacterFlyweightFactory.instance().getCharacterCount());
        System.out.printf("Redução de instâncias de objetos folha      : %.1f%%%n",
                (1.0 - ((double) CharacterFlyweightFactory.instance().getCharacterCount() / noFly.size())) * 100);
    }

    public static void main(String[] args) {
        new DocumentEditor().run();
    }
}
