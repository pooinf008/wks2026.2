package br.edu.ifba.inf011.comportamental.cor.estrutura;

/**
 * Participante: ConcreteHandler2 (Manipulador Concreto 2)
 * 
 * Conforme o GoF:
 * - Trata as solicitações pelas quais é responsável.
 * - Pode acessar seu sucessor.
 * - Se o ConcreteHandler puder tratar a solicitação, ele a trata;
 *   caso contrário, repassa a solicitação para seu sucessor.
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2() {
        super(null);
    }

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    private boolean canHandle(Request request) {
        // ConcreteHandler2 é responsável por requisições do tipo 2
        return request != null && request.getType() == 2;
    }

    @Override
    public void handleRequest(Request request) {
        if (canHandle(request)) {
            System.out.println("[ConcreteHandler2] Tratou a solicitação com sucesso: " + request);
        } else {
            System.out.println("[ConcreteHandler2] Não pode tratar " + request + ". Encaminhando ao sucessor...");
            super.handleRequest(request);
        }
    }
}
