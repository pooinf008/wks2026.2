package br.edu.ifba.inf011.criacional.singleton.estrutura;

/**
 * PARTICIPANTE: Singleton (GoF)
 * 
 * Estrutura genérica do Padrão Singleton conforme o Livro GoF:
 * 1. Define uma operação getInstance() (método estático de classe) que permite aos clientes
 *    acessar a sua instância única.
 * 2. Mantém uma referência estática privada (uniqueInstance) para a sua única instância.
 * 3. Possui construtor privado para impedir a criação direta de instâncias via operador new.
 * 4. Fornece métodos de negócio (singletonOperation) executados sobre a instância compartilhada.
 */
public class Singleton {

    // Atributo estático que armazena a única instância da classe (uniqueInstance)
    private static Singleton uniqueInstance;

    // Atributo de estado do objeto para demonstração
    private String singletonData;

    // Construtor privado: impede a criação direta de instâncias por outras classes
    private Singleton() {
        this.singletonData = "Estado Inicial do Singleton";
    }

    /**
     * Operação estática de classe para obter a única instância do Singleton.
     * Implementa a inicialização preguiçosa (Lazy Initialization).
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    /**
     * Operação do Singleton (singletonOperation) que executa a lógica de negócio do participante.
     */
    public void singletonOperation() {
        System.out.println("Singleton: Executando singletonOperation(). Estado atual: \"" + singletonData + "\"");
    }

    public String getSingletonData() {
        return singletonData;
    }

    public void setSingletonData(String singletonData) {
        this.singletonData = singletonData;
    }
}
