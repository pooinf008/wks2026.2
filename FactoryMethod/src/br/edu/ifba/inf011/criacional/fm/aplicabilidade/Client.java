package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * Executável para teste da aplicação do Factory Method em Hierarquias Paralelas de Classes (GoF).
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Aplicabilidade - Hierarquias Paralelas) ===");

        Figure line = new LineFigure();
        Manipulator manipulator = line.createManipulator();
        this.interact(manipulator);

        Figure text = new TextFigure();
        manipulator = text.createManipulator();
        this.interact(manipulator);
        
    }
    
    public void interact(Manipulator manipulator) {
        manipulator.drag();
        manipulator.resize();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
