package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Classe cliente que demonstra a execução do padrão Chain of Responsibility
 * exatamente conforme descrito na seção 'Motivação' e 'Código de Exemplo'
 * do livro "Padrões de Projetos - Soluções Reutilizáveis de Software Orientados a Objetos" (GoF).
 * 
 * Cenário:
 *   - application com APPLICATION_TOPIC
 *   - printDialog associado a application com PRINT_TOPIC
 *   - paperOrientationButton associado a printDialog com PAPER_ORIENTATION_TOPIC
 *   - defaultButton associado a printDialog sem tópico de ajuda (NO_HELP_TOPIC)
 */
public class Cliente {
	
	public void run() {
        System.out.println("=================================================================");
        System.out.println(" DEMONSTRAÇÃO: CHAIN OF RESPONSIBILITY (MOTIVAÇÃO DO LIVRO GOF)  ");
        System.out.println(" Sistema de Ajuda Sensível ao Contexto para Interface Gráfica    ");
        System.out.println("=================================================================\n");

        // 1. Criação dos manipuladores da cadeia:
        Application app = new Application(Topic.APPLICATION_TOPIC, "Sistema de Desktop");
        Dialog printDialog = new Dialog(app, Topic.PRINT_TOPIC, "Diálogo de Impressão da OS");
        
        Button orientationButton = new Button(printDialog, Topic.PAPER_ORIENTATION_TOPIC, "Orientação da Impressão");
        Button okButton = new Button(printDialog, Topic.NO_HELP_TOPIC, "OK");
        
        Dialog generalDialog = new Dialog(app, Topic.NO_HELP_TOPIC, "Diálogo de Confirmação");
        Button cancelButton = new Button(generalDialog, Topic.NO_HELP_TOPIC, "Cancelar");
        

        System.out.println("Solicitando ajuda para orientationButton (possui ajuda específica):");
        orientationButton.handleHelp();
        System.out.println();

        System.out.println("Solicitando ajuda para okButton (não tem ajuda própria, repassa ao printDialog):");
        okButton.handleHelp();
        System.out.println();

        System.out.println("Solicitando ajuda para cancelButton (repassa pelo diálogo e é atendido por Application):");
        cancelButton.handleHelp();
        System.out.println();

        System.out.println("Solicitando ajuda ao Diálogo de Impressão");
        printDialog.handleHelp();
        System.out.println();

        System.out.println("Solicitando ajuda à Aplicação ---");
        app.handleHelp();
        System.out.println();
	}
	
	public void run2() {
        Application app = new Application(Topic.NO_HELP_TOPIC, "Sistema de Desktop");
        app.handleHelp();
	}
	

    public static void main(String[] args) {
    	new Cliente().run();
    }
}
