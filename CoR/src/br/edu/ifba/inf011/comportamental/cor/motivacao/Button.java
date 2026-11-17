package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Representa um botão na interface do usuário (ex: botão "Imprimir", "Orientação").
 * Conforme o GoF, se o botão tiver ajuda associada (hasHelp() == true), ele mesmo
 * a fornece. Caso contrário, repassa a requisição para o seu sucessor (Widget::handleHelp()).
 */
public class Button extends Widget {
    private String label;

    public Button(Widget parent) {
        this(parent, Topic.NO_HELP_TOPIC, "Botão");
    }

    public Button(Widget parent, Topic topic) {
        this(parent, topic, "Botão");
    }

    public Button(Widget parent, Topic topic, String label) {
        super(parent, topic);
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public void handleHelp() {
        if (!hasHelp()) {
        	super.handleHelp();
        	return;
        }	
        System.out.println("[Botão '" + label + "'] Ajuda Específica: " 
                    + getTopic().getDescription() + " (Tópico " + getTopic().getCode() + ")");
    }
}
