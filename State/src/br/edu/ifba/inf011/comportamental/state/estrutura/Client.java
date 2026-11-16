package br.edu.ifba.inf011.comportamental.state.estrutura;

/**
 * PARTICIPANTE: Client (GoF - Estrutura)
 * 
 * Conforme o GoF:
 * "O Context delega solicitações dependentes de estado para o objeto ConcreteState corrente.
 * Os clientes interagem principalmente com o Context, configurando-o opcionalmente com um
 * estado inicial e invocando sua operação Request()."
 * 
 * Demonstra a instanciação do Context, o polimorfismo das operações e a transição
 * dinâmica de estados entre ConcreteStateA e ConcreteStateB.
 */
public class Client {

    public void run() {
        System.out.println("==========================================================");
        System.out.println("=== Padrão GoF: State (Estrutura Canônica) ==============");
        System.out.println("==========================================================\n");

        System.out.println("-- 1. Context criado com estado inicial ConcreteStateA:");
        Context context = new Context(new ConcreteStateA());
        System.out.println("Estado inicial: " + context.getState());

        System.out.println("\n-- 2. Primeira chamada a request():");
        context.request();
        System.out.println("Estado atual após transição: " + context.getState());

        System.out.println("\n-- 3. Segunda chamada a request():");
        context.request();
        System.out.println("Estado atual após transição: " + context.getState());

        //NÃO GOSTO DESSA ABORDAGEM
        System.out.println("\n-- 4. Definindo explicitamente o estado para ConcreteStateB:");
        context.setState(new ConcreteStateB()); 
        System.out.println("Estado atual: " + context.getState());

        System.out.println("\n-- 5. Terceira chamada a request():");
        context.request();
        System.out.println("Estado atual após transição: " + context.getState());

    }

    public static void main(String[] args) {
        new Client().run();
    }
}
