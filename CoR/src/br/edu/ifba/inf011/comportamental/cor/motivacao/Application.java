package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Representa a aplicação principal, sendo o último elo na cadeia de responsabilidade
 * para requisições de ajuda que não foram tratadas por nenhum widget específico.
 * Subclasse direta de HelpHandler, conforme o GoF.
 */
public class Application extends HelpHandler {
    private String appName;

    public Application() {
        this(Topic.APPLICATION_TOPIC, "Aplicação Principal");
    }

    public Application(Topic topic) {
        this(topic, "Aplicação Principal");
    }

    public Application(Topic topic, String appName) {
        super(null, topic);
        this.appName = appName;
    }

    public String getAppName() {
        return this.appName;
    }

    @Override
    public void handleHelp() {
        System.out.println("[Aplicação '" + appName + "'] Ajuda Geral: " 
                + this.getTopic().getDescription() + " (Tópico " + this.getTopic().getCode() + ")");
    }
}
