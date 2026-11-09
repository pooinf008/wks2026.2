package br.edu.ifba.inf011.estrutural.flyweight.variacao1;

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
public class CharacterFlyweightFactory {

    private final Map<java.lang.Character, CharacterFlyweight> characters = new HashMap<>();

    private static CharacterFlyweightFactory factory;
    
    private CharacterFlyweightFactory() {
    	
    }
    
    public static CharacterFlyweightFactory instance() {
    	if(CharacterFlyweightFactory.factory == null)
    		CharacterFlyweightFactory.factory = new CharacterFlyweightFactory();
    	return CharacterFlyweightFactory.factory;
    }
    
    
    public CharacterFlyweight createCharacter(char c) {
        CharacterFlyweight character = this.characters.get(c);
        if (character == null) {
            character = new CharacterFlyweight(c);
            this.characters.put(c, character);
        }
        return character;
    }

    public int getCharacterCount() {
        return this.characters.size();
    }
}
