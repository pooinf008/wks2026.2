package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Padrão GoF Builder: Construtor Concreto 1 (ASCIIConverter)
 * 
 * Converte tokens RTF ignorando solicitações de formatação (fontes e parágrafos),
 * acumulando apenas os caracteres para construir a representação ASCIIText.
 */
public class ASCIIConverter extends TextConverter {
    private final StringBuilder asciiBuffer = new StringBuilder();

    @Override
    public void convertCharacter(char c) {
        asciiBuffer.append(c);
    }

    /**
     * Retorna o produto resultante da conversão em texto ASCII.
     * De acordo com o padrão GoF, como os produtos de conversores diferentes não possuem
     * uma interface comum necessária, cada conversor concreto disponibiliza seu próprio
     * método para retornar seu tipo de produto específico.
     */
    public ASCIIText getASCIIText() {
        return new ASCIIText(asciiBuffer.toString());
    }
}
