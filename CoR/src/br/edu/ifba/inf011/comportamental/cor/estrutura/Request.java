package br.edu.ifba.inf011.comportamental.cor.estrutura;

/**
 * Representa a solicitação (Request) trafegada ao longo da cadeia de responsabilidade.
 */
public class Request {
    private int type;
    private String description;

    public Request(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Request[tipo=" + type + ", descricao='" + description + "']";
    }
}
