package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: RefinedAbstraction (GoF - Motivação)
 * Especializa a abstração Window para janelas transitórias (como caixas de diálogo).
 * 
 * Adiciona a operação drawCloseBox(), desenhando uma caixa de fechamento via drawRect().
 */
public class TransientWindow extends Window {

    public TransientWindow(WindowImp imp) {
        super(imp);
    }

    public void drawCloseBox() {
        System.out.println("TransientWindow: desenhando botão de fechar...");
        this.drawRect(180, 5, 195, 20);
    }
}
