package br.edu.ifba.inf011.criacional.singleton.variacao1;

/**
 * Subclasse de Singleton 1 (MySingleton)
 * 
 * Demonstra a criação de uma subclasse especializada do Singleton.
 * Registra a sua própria instância no Registro de Singletons da classe base.
 */
public class MySingleton extends Singleton {

    // Bloco estático para auto-registro da subclasse no registro do Singleton
    static {
        MySingleton myInstance = new MySingleton();
        Singleton.register("MySingleton", myInstance);
    }

    protected MySingleton() {
        super();
    }

    @Override
    public void operation() {
        System.out.println("Executando operação especializada em MySingleton (Subclasse 1).");
    }
}
