package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<String> itens = new ArrayList<>();
    private double valorTotal = 0.0;

    public void adicionarItem(String descricao, double custoMensal) {
        this.itens.add(String.format("%-50s : $ %.2f", descricao, custoMensal));
        this.valorTotal += custoMensal;
    }

    public String gerar() {
    	
    	StringBuilder str = new StringBuilder();
    	str.append("\n=== FATURA MENSAL ESTIMADA (INVOICE) ===\n");
        for (String item : itens)
        	str.append(item + "\n");
        str.append("--------------------------------------------------\n");
        str.append(String.format("%-50s : $ %.2f\n", "TOTAL ESTIMADO/MÊS", valorTotal));
        str.append("==================================================\n\n");
        return str.toString();
    }
}
