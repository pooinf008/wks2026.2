package br.edu.ifba.inf011.criacional.singleton.variacao1;

import java.util.HashMap;
import java.util.Map;

/**
 * Padrão GoF: Singleton - Seção Implementação ("Criando subclasses da classe Singleton")
 * 
 * Implementação utilizando um Registro de Singletons (Registry of Singletons):
 * 1. A classe base Singleton mantém um mapa de registro (registry) que associa nomes
 *    às instâncias registradas das subclasses.
 * 2. Subclasses (como MySingleton e SpecialSingleton) registram suas instâncias no registro.
 * 3. O método getInstance() pode buscar a instância pelo nome ou consultar uma variável
 *    de ambiente/propriedade de sistema para selecionar a subclasse desejada sem alterar o cliente.
 */
public class Singleton {

    private static final Map<String, Singleton> registry = new HashMap<>();
    private static Singleton instance;
    protected Singleton() {
    }

    public static synchronized void register(String name, Singleton singleton) {
        registry.put(name, singleton);
    }

    public static synchronized Singleton getInstance(String name) {
        if (!registry.containsKey(name)) {
            System.out.println("Singleton: Nenhuma instância registrada com o nome '" + name + "'.");
            return null;
        }
        return registry.get(name);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            String singletonName = System.getProperty("SINGLETON_TYPE", "DefaultSingleton");
            instance = registry.get(singletonName);
            if (instance == null) {
                instance = new Singleton();
                register("DefaultSingleton", instance);
            }
        }
        return instance;
    }

    public static synchronized void setInstance(Singleton newInstance) {
        instance = newInstance;
    }

    public void operation() {
        System.out.println("Executando operação na classe base Singleton.");
    }

    @Override
    public String toString() {
        return "Instância de " + this.getClass().getSimpleName();
    }
}
