package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: Implementor (GoF - Motivação)
 * Define a interface para as classes de implementação específicas de plataforma
 * (como X Window System e IBM Presentation Manager).
 * 
 * Fornece apenas operações primitivas de desenho (devDrawText, devDrawLine),
 * sobre as quais a abstração Window constrói operações de nível mais alto.
 */
public interface WindowImp {
    public void devDrawText(String text, int x, int y);
    public void devDrawLine(int x1, int y1, int x2, int y2);
}
