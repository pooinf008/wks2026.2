package br.edu.ifba.inf011.comportamental.cor.motivacao;

/**
 * Representa os tópicos de ajuda sensíveis ao contexto,
 * conforme definido na seção de Motivação e Código de Exemplo do GoF:
 * 
 * typedef int Topic;
 * const Topic NO_HELP_TOPIC = -1;
 * const Topic PRINT_TOPIC = 1;
 * const Topic PAPER_ORIENTATION_TOPIC = 2;
 * const Topic APPLICATION_TOPIC = 3;
 */
public enum Topic {
    NO_HELP_TOPIC(-1, "Nenhum tópico de ajuda definido"),
    PRINT_TOPIC(1, "Ajuda sobre Configurações e Impressão"),
    PAPER_ORIENTATION_TOPIC(2, "Ajuda sobre Orientação do Papel (Retrato/Paisagem)"),
    APPLICATION_TOPIC(3, "Ajuda Geral da Aplicação");

    private final int code;
    private final String description;

    Topic(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
