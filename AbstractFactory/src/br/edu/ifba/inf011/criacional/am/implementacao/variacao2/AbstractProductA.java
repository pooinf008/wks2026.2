package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: AbstractProduct A (GoF - Com Suporte a Protótipo / Clone)
 */
public interface AbstractProductA extends Cloneable {
	public void executeA();
	public AbstractProductA clone();
}
