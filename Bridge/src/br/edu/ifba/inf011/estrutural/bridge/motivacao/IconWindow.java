package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: RefinedAbstraction (GoF - Motivação)
 * Especializa a abstração Window para representar janelas de ícones.
 * 
 * Adiciona a operação drawBorder(), que utiliza drawRect() e drawText()
 * definidos na classe base Window.
 */
public class IconWindow extends Window {

    public IconWindow(WindowImp imp) {
        super(imp);
    }

    public void drawBorder() {
        System.out.println("IconWindow: desenhando borda do ícone...");
        this.drawRect(0, 0, 32, 32);
        this.drawText("Icon", 8, 16);
    }
}
