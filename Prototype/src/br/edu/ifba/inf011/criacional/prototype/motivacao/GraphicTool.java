package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: Client (GoF) / GraphicTool do Framework
 * Ferramenta genérica do framework de edição gráfica. 
 * Em vez de necessitar de subclasses concretas para cada elemento gráfico (StaffTool, NoteTool, RestTool),
 * ela é parametrizada por uma INSTÂNCIA PROTÓTIPO de Graphic.
 * Ao ser manipulada, clona o protótipo e adiciona a nova instância ao Canva Virtual.
 */
public class GraphicTool implements Tool {

    private Graphic prototype;
    private Canvas canvas;

    public GraphicTool(Canvas canvas) {
        this.canvas = canvas;
    }

    public GraphicTool(Graphic prototype, Canvas canvas) {
        this.prototype = prototype;
        this.canvas = canvas;
    }

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }

    public Graphic getPrototype() {
        return prototype;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    @Override
    public void manipulate(Position position) {
        if (prototype == null) {
            System.out.println("GraphicTool: Nenhum protótipo configurado.");
            return;
        }
        if (canvas == null) {
            System.out.println("GraphicTool: Nenhum Canva configurado.");
            return;
        }

        // MOTIVAÇÃO GOF PROTOTYPE:
        // A ferramenta do framework cria o elemento gráfico específico CLONANDO o protótipo
        // sem precisar conhecer a classe concreta do elemento (evitando a explosão de subclasses de Tool).
        Graphic newGraphic = prototype.clone();
        newGraphic.setPosition(position);
        
        // Adiciona a nova instância clonada ao canva virtual
        canvas.add(newGraphic);
    }
}
