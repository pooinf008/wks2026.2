package br.edu.ifba.inf011.comportamental.cor.estrutura;

/**
 * Participante: Client (Cliente)
 * 
 * Conforme o GoF:
 * - Inicia a solicitação para um objeto ConcreteHandler na cadeia.
 * - Demonstra a colaboração: a solicitação se propaga ao longo da cadeia
 *   até que um objeto ConcreteHandler assuma a responsabilidade por seu tratamento.
 */
public class Client {
	
	
	public void run() {
        System.out.println("=========================================================");
        System.out.println(" DEMONSTRAÇÃO: CHAIN OF RESPONSIBILITY (ESTRUTURA GOF)  ");
        System.out.println("=========================================================\n");

        // Montagem da cadeia de responsabilidade conforme o diagrama de objetos do GoF:
        // aClient -> aConcreteHandler1 -> aConcreteHandler2
        Handler handler2 = new ConcreteHandler2(null);
        Handler handler1 = new ConcreteHandler1(handler2);

        System.out.println("--- 1. Enviando Requisição Tipo 1 (Tratada por ConcreteHandler1) ---");
        Request req1 = new Request(1, "Solicitação de Nível 1");
        handler1.handleRequest(req1);
        System.out.println();

        System.out.println("--- 2. Enviando Requisição Tipo 2 (Tratada por ConcreteHandler2) ---");
        Request req2 = new Request(2, "Solicitação de Nível 2");
        handler1.handleRequest(req2);
        System.out.println();

        System.out.println("--- 3. Enviando Requisição Tipo 3 (Nenhum manipulador trata) ---");
        Request req3 = new Request(3, "Solicitação de Nível 3 Desconhecida");
        handler1.handleRequest(req3);
        System.out.println();

        System.out.println("=========================================================");		
	}

    public static void main(String[] args) {
    	new Client().run();
    }
}
