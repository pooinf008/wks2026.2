package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * Classe principal para execução e demonstração da Motivação do Padrão Prototype (GoF).
 * 
 * Cenário GoF (Editor de Partituras Musicais / Music Score Editor):
 * O framework de edição gráfica fornece GraphicTool para criar elementos gráficos na paleta.
 * Usando o padrão Prototype, GraphicTool cria novos elementos gráficos (Pautas, Notas Musicais, Pausas)
 * clonando uma instância protótipo configurada e adicionando-os ao Canva Virtual.
 * Ao final, a partitura gerada é impressa através do método printScore() do Canva que retorna uma String.
 */
public class Client {

    public void runDemo() {
        System.out.println("=== Padrão GoF: Prototype (Motivação com Canva Virtual) ===\n");

        // 1. Instanciação do Canva Virtual (Documento da Partitura)
        Canvas canvas = new Canvas();

        // 2. Criação dos protótipos de elementos gráficos da partitura
        Graphic staffPrototype = new Staff();
        Graphic quarterNotePrototype = new MusicalNote("Semínima", "Dó");
        Graphic halfNotePrototype = new MusicalNote("Mínima", "Sol");
        Graphic restPrototype = new Rest("Pausa de Semínima");

        // 3. Instanciação da GraphicTool associada ao Canva Virtual
        GraphicTool tool = new GraphicTool(canvas);

        // 4. Adicionando Pauta no Canva usando o protótipo Staff
        tool.setPrototype(staffPrototype);
        tool.manipulate(new Position(10, 50));

        // 5. Adicionando Notas Semínimas no Canva
        tool.setPrototype(quarterNotePrototype);
        tool.manipulate(new Position(15, 52));
        tool.manipulate(new Position(25, 54));

        // 6. Adicionando Nota Mínima no Canva
        tool.setPrototype(halfNotePrototype);
        tool.manipulate(new Position(35, 58));

        // 7. Adicionando Pausa no Canva
        tool.setPrototype(restPrototype);
        tool.manipulate(new Position(45, 50));

        // 8. Impressão da música a partir do método printScore() do Canva que retorna uma String
        String musicPrintout = canvas.printScore();
        System.out.println(musicPrintout);
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
