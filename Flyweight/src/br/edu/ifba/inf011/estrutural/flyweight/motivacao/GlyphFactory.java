package br.edu.ifba.inf011.estrutural.flyweight.motivacao;

import java.util.HashMap;
import java.util.Map;

/**
 * PARTICIPANTE: FlyweightFactory (GoF)
 * Cria e gerencia os objetos Glyph, garantindo o compartilhamento adequado dos caracteres.
 * 
 * Mantém um pool de objetos Character indexados pelo seu código (charcode).
 * Quando um caractere é solicitado, retorna a instância já existente ou aloca uma
 * nova se ainda não estiver presente.
 */
public class GlyphFactory {

    private final Map<java.lang.Character, Character> characters = new HashMap<>();

    private static GlyphFactory factory;
    
    private GlyphFactory() {
    	
    }
    
    public static GlyphFactory instance() {
    	if(GlyphFactory.factory == null)
    		GlyphFactory.factory = new GlyphFactory();
    	return GlyphFactory.factory;
    }
    
    
    public Character createCharacter(char c) {
        Character character = this.characters.get(c);
        if (character == null) {
            character = new Character(c);
            this.characters.put(c, character);
        }
        return character;
    }

    public Row createRow() {
        return new Row();
    }

    public int getCharacterCount() {
        return this.characters.size();
    }
}
