package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Padrão GoF Builder: Construtor Abstrato (TextConverter)
 * 
 * Especifica uma interface abstrata para a criação de partes do objeto produto.
 * Conforme o livro GoF, os métodos oferecem implementações padrão vazias (empty body)
 * para que os conversores concretos implementem apenas as conversões que lhes interessam.
 */
public abstract class TextConverter {
    
    /**
     * Solicitação de conversão de caractere.
     */
    public void convertCharacter(char c) {}

    /**
     * Solicitação de conversão de troca de fonte.
     */
    public void convertFontChange(Font font) {}

    /**
     * Solicitação de conversão de quebra de parágrafo.
     */
    public void convertParagraph() {}
}
