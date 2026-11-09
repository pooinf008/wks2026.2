package br.edu.ifba.inf011.estrutural.flyweight.variacao1;

/**
 * PARTICIPANTE: ConcreteFlyweight (GoF)
 * Representa um caractere individual no documento de texto.
 * 
 * Armazena APENAS o estado intrínseco: o código do caractere (charcode).
 * Todo o estado dependente de contexto é recebido
 * externamente durante a operação draw().
 * Desta forma, a mesma instância deste caractere pode ser compartilhada
 * milhares de vezes em qualquer linha, página ou documento.
 */
public class CharacterFlyweight {

    private final char charcode;

    public CharacterFlyweight(char charcode) {
        this.charcode = charcode;
    }

    public void draw(int x, int y) {
        System.out.printf(" Desenhando '%c' na posição (%d, %d)%n", this.charcode, x, y);
    }


}
