package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao1;

public class SistemaBrasileiro {
    public void lavarMaos(TorneiraBrasileira torneira) {
        System.out.println("--- [Sistema Brasil] Usando a interface TorneiraBrasileira ---");
        torneira.abrir();
        System.out.println("Lavando as mãos com água corrente...");
        torneira.fechar();
    }
}
