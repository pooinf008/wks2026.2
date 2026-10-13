package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao1;

public class Cliente {
	
    public void run() {
        TwoWayFaucetAdapter torneiraUniversal = new TwoWayFaucetAdapter();
        SistemaBrasileiro sistemaBR = new SistemaBrasileiro();
        SistemaAmericano sistemaUS = new SistemaAmericano();
        sistemaBR.lavarMaos(torneiraUniversal);
        sistemaUS.washHands(torneiraUniversal);
        
        System.out.println("=== RELATÓRIO DO HIDRÔMETRO ===");
        System.out.println("Total global de vezes que a torneira foi aberta: " 
                           + torneiraUniversal.getContadorAberturas());        
        
    }
	
    
    public static void main(String[] args) {
		new Cliente().run();
	}

}
