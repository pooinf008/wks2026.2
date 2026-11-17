package br.edu.ifba.inf011.comportamental.cor.estrutura;

/**
 * Participante: Handler (Manipulador)
 * 
 * Conforme o GoF (seção Estrutura e Participantes):
 * - Define uma interface para tratar as solicitações (handleRequest).
 * - (Opcional) Implementa o link para o sucessor na cadeia (successor).
 * - Fornece uma implementação padrão de handleRequest que encaminha o pedido
 *   ao sucessor se ele existir.
 */
public abstract class Handler {
    private Handler successor;

    public Handler() {
        this(null);
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return this.successor;
    }

    /**
     * Implementação padrão do tratamento: repassa para o sucessor caso exista.
     */
    public void handleRequest(Request request) {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        } else {
            System.out.println("Fim da cadeia: Nenhum manipulador atendeu à solicitação " + request);
        }
    }
}
