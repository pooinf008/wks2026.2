package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Classe abstrata base para todos os elementos de interface gráfica do usuário (Widgets).
 * Todo Widget possui uma referência para seu container pai (parent), que atua como seu
 * sucessor na cadeia de manipuladores de ajuda, integrando a hierarquia de composição (Composite)
 * com a cadeia de responsabilidade (Chain of Responsibility).
 */
public abstract class Widget extends HelpHandler {
    private Widget parent;

    protected Widget(Widget parent) {
        this(parent, Topic.NO_HELP_TOPIC);
    }

    protected Widget(Widget parent, Topic topic) {
        super(parent, topic);
        this.parent = parent;
    }

    public Widget getParent() {
        return this.parent;
    }
}
