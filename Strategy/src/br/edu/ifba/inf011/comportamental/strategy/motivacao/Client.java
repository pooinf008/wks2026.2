package br.edu.ifba.inf011.comportamental.strategy.motivacao;

/**
 * PARTICIPANTE: Client (GoF - Motivação)
 * 
 * Demonstra o uso da classe Composition com as 3 estratégias de formatação:
 * 1. SimpleCompositor (HardBreak): quebra o texto na largura, mesmo que divida palavras.
 * 2. WordBreakCompositor: só coloca palavras se couber na largura da linha.
 * 3. JustifiedCompositor: quando não cabe tenta justificar colocando espaços entre as palavras.
 */
public class Client {

    public void run() {
        System.out.println("==========================================================================");
        System.out.println("=== Padrão Strategy: Formatação de Texto com 3 Estratégias (GoF) ======");
        System.out.println("==========================================================================\n");

        String texto = "O padrao Strategy define uma familia de algoritmos, encapsula cada um deles e os torna intercambiaveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.";
        int largura = 32;

        System.out.println("Texto de Entrada:");
        System.out.println("\"" + texto + "\"");
        System.out.println("Largura da Linha: " + largura + " caracteres\n");

        // Cria a Composition apenas com texto, largura e a primeira estratégia
        Composition composition = new Composition(texto, largura, new HardBreakCompositor());

        System.out.println("=== 1. Estratégia 1: Quebra na largura (mesmo dividindo a palavra) ===");
        composition.repair();
        composition.display();

        System.out.println("\n=== 2. Estratégia 2: Só coloca palavras se couber na largura da linha ===");
        composition.setCompositor(new WordBreakCompositor());
        composition.repair();
        composition.display();

        System.out.println("\n=== 3. Estratégia 3: Quando não cabe tenta justificar com espaços entre palavras ===");
        composition.setCompositor(new JustifiedCompositor());
        composition.repair();
        composition.display();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
