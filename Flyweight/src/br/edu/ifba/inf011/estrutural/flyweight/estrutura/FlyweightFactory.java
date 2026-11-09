package br.edu.ifba.inf011.estrutural.flyweight.estrutura;

import java.util.HashMap;
import java.util.Map;

/**
 * PARTICIPANTE: FlyweightFactory (GoF)
 * Cria e gerencia objetos flyweight. Garante que os flyweights sejam compartilhados
 * de forma apropriada. Quando um cliente solicita um flyweight, o objeto FlyweightFactory
 * fornece uma instância existente ou cria uma, se nenhuma existir.
 * 
 * Estrutura GoF:
 * if (flyweights[key] exists) {
 *     return flyweights[key];
 * } else {
 *     create new flyweight;
 *     add it to flyweights[key];
 *     return it;
 * }
 */
public class FlyweightFactory {

    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!this.flyweights.containsKey(key)) {
            this.flyweights.put(key, new ConcreteFlyweight(key));
        }
        return this.flyweights.get(key);
    }

    public int getFlyweightCount() {
        return this.flyweights.size();
    }
}
