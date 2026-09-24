package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao1;

import java.util.HashMap;
import java.util.Map;

/**
 * PARTICIPANTE: PrototypeManager / Registry (GoF Implementação Variação 1 - Usar um gerenciador de protótipos)
 * 
 * Mantém um registro dinâmico (chave-valor) de protótipos disponíveis.
 * Permite que os clientes cadastrem, removam e recuperem novos objetos clonados
 * a partir de suas chaves identificadoras.
 */
public class PrototypeManager {

    private final Map<String, Prototype> registry = new HashMap<>();

    /**
     * Registra um protótipo com uma chave única.
     */
    public void registerPrototype(String key, Prototype prototype) {
        if (key != null && prototype != null) {
            this.registry.put(key, prototype);
            System.out.println("PrototypeManager: Registrado protótipo '" + key + "' -> " 
                    + prototype.getClass().getSimpleName());
        }
    }

    /**
     * Remove o protótipo associado à chave informada.
     */
    public void unregisterPrototype(String key) {
        if (this.registry.remove(key) != null) {
            System.out.println("PrototypeManager: Removido protótipo '" + key + "'");
        }
    }

    /**
     * Busca o protótipo registrado pela chave e retorna uma nova CÓPIA (clone).
     */
    public Prototype getPrototype(String key) {
        Prototype prototype = this.registry.get(key);
        if (prototype == null) {
            System.out.println("PrototypeManager: Erro! Nenhum protótipo encontrado para a chave '" + key + "'.");
            return null;
        }
        return prototype.clone();
    }

    /**
     * Verifica se uma chave está cadastrada no gerenciador.
     */
    public boolean hasPrototype(String key) {
        return this.registry.containsKey(key);
    }

    /**
     * Retorna o total de protótipos cadastrados.
     */
    public int count() {
        return this.registry.size();
    }
}
