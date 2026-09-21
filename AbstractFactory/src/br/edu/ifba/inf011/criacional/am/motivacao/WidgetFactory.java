package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: AbstractFactory (GoF)
 * Declara métodos de fabricação para cada tipo de widget (ScrollBar e Window) no toolkit visual.
 */
public interface WidgetFactory {
	public ScrollBar createScrollBar();
	public Window createWindow();
}
