package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: Abstraction (GoF - Motivação)
 * Define a abstração de uma Janela e mantém uma referência para um objeto WindowImp (a ponte).
 * 
 * Define operações gráficas de alto nível (como drawRect e drawText)
 * em termos das operações primitivas fornecidas por WindowImp.
 */
public abstract class Window {

    protected final WindowImp imp;

    protected Window(WindowImp imp) {
        this.imp = imp;
    }

    public void drawText(String text, int x, int y) {
    	this.imp.devDrawText(text, x, y);
    }

    /**
     * Desenha um retângulo combinando 4 chamadas à primitiva devDrawLine.
     * Conforme descrito no GoF, a abstração compõe primitivas do implementor.
     */
    public void drawRect(int x1, int y1, int x2, int y2) {
    	this.imp.devDrawLine(x1, y1, x2, y1);
    	this.imp.devDrawLine(x2, y1, x2, y2);
    	this.imp.devDrawLine(x2, y2, x1, y2);
    	this.imp.devDrawLine(x1, y2, x1, y1);
    }

    public WindowImp getWindowImp() {
        return this.imp;
    }
}
