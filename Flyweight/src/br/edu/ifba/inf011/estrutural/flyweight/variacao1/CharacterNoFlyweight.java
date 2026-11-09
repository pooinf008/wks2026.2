package br.edu.ifba.inf011.estrutural.flyweight.variacao1;

public class CharacterNoFlyweight implements CharacterGlyph{
	
    private final char charcode;
    private final int x;
    private final int y;

    public CharacterNoFlyweight(int x, int y, char charcode) {
    	this.x = x;
    	this.y = y;
        this.charcode = charcode;
    }

    public void draw() {
        System.out.printf(" Desenhando '%c' na posição (%d, %d)%n", this.charcode, this.x, this.y);
    }	

}
