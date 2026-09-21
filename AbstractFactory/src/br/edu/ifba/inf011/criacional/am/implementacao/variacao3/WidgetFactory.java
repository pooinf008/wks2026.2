package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: AbstractFactory Extensível (GoF - Implementação: Fábricas Extensíveis)
 *
 * Conforme o livro GoF (Implementation item 3), em vez de declarar métodos específicos
 * para cada produto (como createScrollBar(), createWindow()), a fábrica declara uma ÚNICA
 * operação 'make' parametrizada. Isso torna a fábrica facilmente extensível para novos
 * tipos de produtos sem alterar a assinatura da interface WidgetFactory.
 */
public interface WidgetFactory {
	public Widget make(WidgetType widgetType);
}
