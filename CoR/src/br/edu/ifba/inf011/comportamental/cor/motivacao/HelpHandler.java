package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Classe base abstrata que define a interface para tratamento de pedidos de ajuda
 * e mantém a referência para o sucessor na cadeia de responsabilidade (Chain of Responsibility),
 * conforme a seção de Motivação do GoF.
 */
public abstract class HelpHandler {
    private HelpHandler successor;
    private Topic topic;

    public HelpHandler() {
        this(null, Topic.NO_HELP_TOPIC);
    }

    public HelpHandler(HelpHandler successor) {
        this(successor, Topic.NO_HELP_TOPIC);
    }

    public HelpHandler(HelpHandler successor, Topic topic) {
        this.successor = successor;
        this.topic = (topic != null) ? topic : Topic.NO_HELP_TOPIC;
    }

    public boolean hasHelp() {
        return this.topic != Topic.NO_HELP_TOPIC;
    }

    public void setHandler(HelpHandler successor, Topic topic) {
        this.successor = successor;
        this.topic = (topic != null) ? topic : Topic.NO_HELP_TOPIC;
    }

    public void setSuccessor(HelpHandler successor) {
        this.successor = successor;
    }

    public HelpHandler getSuccessor() {
        return this.successor;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = (topic != null) ? topic : Topic.NO_HELP_TOPIC;
    }

    public void handleHelp() {
        if (this.successor == null)
        	System.out.println("Fim da cadeia: Nenhuma ajuda disponível para este componente.");
        this.successor.handleHelp();
    }
}
