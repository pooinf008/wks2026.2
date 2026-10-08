package br.edu.ifba.inf011.criacional.singleton.variacao1;

/**
 * Subclasse de Singleton 2 (SpecialSingleton)
 * 
 * Outra subclasse especializada que é registrada sob a chave "SpecialSingleton".
 */
public class SpecialSingleton extends Singleton {

    static {
        SpecialSingleton specialInstance = new SpecialSingleton();
        Singleton.register("SpecialSingleton", specialInstance);
    }

    protected SpecialSingleton() {
        super();
    }

    @Override
    public void operation() {
        System.out.println("Executando operação altamente especializada em SpecialSingleton (Subclasse 2).");
    }
}
