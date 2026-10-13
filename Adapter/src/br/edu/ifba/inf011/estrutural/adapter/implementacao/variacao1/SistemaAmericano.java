package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao1;

public class SistemaAmericano {
	
    public void washHands(AmericanFaucet faucet) {
        System.out.println("--- [Sistema EUA] Usando a interface AmericanFaucet ---");
        faucet.turnOn();
        System.out.println("Washing hands with running water...");
        faucet.turnOff();
    }	

}
