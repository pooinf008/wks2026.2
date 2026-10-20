package br.edu.ifba.inf011.model;

public class IAASScript {
    private StringBuilder scriptContent;

    public IAASScript() {
        this.scriptContent = new StringBuilder();
        this.scriptContent.append("# --- Arquivo de Provisionamento IaaS (Terraform) ---\n\n");
    }

    public void appendResource(String resourceBlock) {
        this.scriptContent.append(resourceBlock).append("\n");
    }

    public String exportToFile() {
    	this.scriptContent.append("# [FIM DO ARQUIVO GERADO]");
    	return this.scriptContent.toString();
    }
}