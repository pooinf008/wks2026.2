package br.edu.ifba.inf011.comportamental.cor.estrutura;

/**
 * Participante: ConcreteHandler1 (Manipulador Concreto 1)
 * 
 * Conforme o GoF:
 * - Trata as solicitações pelas quais é responsável.
 * - Pode acessar seu sucessor.
 * - Se o ConcreteHandler puder tratar a solicitação, ele a trata;
 *   caso contrário, repassa a solicitação para seu sucessor.
 */
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1() {
        super(null);
    }

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    private boolean canHandle(Request request) {
        // ConcreteHandler1 é responsável por requisições do tipo 1
        return request != null && request.getType() == 1;
    }

    @Override
    public void handleRequest(Request request) {
        if (canHandle(request)) {
            System.out.println("[ConcreteHandler1] Tratou a solicitação com sucesso: " + request);
        } else {
            System.out.println("[ConcreteHandler1] Não pode tratar " + request + ". Encaminhando ao sucessor...");
            super.handleRequest(request);
        }
    }
}
