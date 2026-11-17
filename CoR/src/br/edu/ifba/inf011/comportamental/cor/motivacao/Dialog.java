package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Representa uma caixa de diálogo na interface gráfica (ex: Diálogo de Impressão).
 * Conforme o GoF, Dialog herda de Widget, mas seu sucessor pode ser qualquer HelpHandler
 * (como a própria Application). Se o diálogo tiver ajuda associada, ele a exibe;
 * caso contrário, repassa a solicitação para o seu sucessor na cadeia.
 */
public class Dialog extends Widget {
    private String title;

    public Dialog(HelpHandler handler) {
        this(handler, Topic.NO_HELP_TOPIC, "Diálogo");
    }

    public Dialog(HelpHandler handler, Topic topic) {
        this(handler, topic, "Diálogo");
    }

    public Dialog(HelpHandler handler, Topic topic, String title) {
        super(null);
        this.title = title;
        setHandler(handler, topic);
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void handleHelp() {
        if (!hasHelp()) {
        	super.handleHelp();
        	return;
        }	
         System.out.println("[Diálogo '" + title + "'] Ajuda do Diálogo: " 
        		 			 + this.getTopic().getDescription() + " (Tópico " + this.getTopic().getCode() + ")");
	    }
}
