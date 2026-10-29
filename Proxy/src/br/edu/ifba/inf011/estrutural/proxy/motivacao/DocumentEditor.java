package br.edu.ifba.inf011.estrutural.proxy.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Client (GoF)
 * Editor de documentos que acessa imagens embutidas apenas pela interface
 * Graphic. Não sabe se está lidando com uma Image ou com um ImageProxy.
 */
public class DocumentEditor {

    private final List<Graphic> graphics = new ArrayList<>();

    public void insert(Graphic graphic) {
        graphics.add(graphic);
    }

    public void format() {
        for (Graphic g : graphics) {
            System.out.println("DocumentEditor: formatando com extent " + g.getExtent());
        }
    }

    public void draw() {
        for (Graphic g : graphics) {
            g.draw();
        }
    }

    public void run() {
        System.out.println("=== Padrão GoF: Proxy (Motivação - ImageProxy em editor de documentos) ===\n");

        this.insert(new ImageProxy("anImageFileName"));
        System.out.println("-- Documento aberto (imagem ainda não carregada)");
        this.format();
        System.out.println("-- Imagem se torna visível");
        this.draw();
        this.draw();
    }

    public static void main(String[] args) {
        new DocumentEditor().run();
    }
}
