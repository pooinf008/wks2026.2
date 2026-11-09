package br.edu.ifba.inf011.estrutural.flyweight.variacao1;

public class CharacterClient implements CharacterGlyph{
	
	private int x;
	private int y;
	private CharacterFlyweight flyweight;
	
	public CharacterClient(int x, int y, char charcode) {
		this.x = x;
		this.y = y;
		this.flyweight = CharacterFlyweightFactory.instance().createCharacter(charcode);
	}

	@Override
	public void draw() {
		this.flyweight.draw(x, y);
	}

}
