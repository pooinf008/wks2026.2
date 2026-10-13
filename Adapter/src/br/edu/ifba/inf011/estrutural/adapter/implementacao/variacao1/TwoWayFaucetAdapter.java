package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao1;

public class TwoWayFaucetAdapter implements TorneiraBrasileira, AmericanFaucet {
    private boolean aberta = false;
    private int contadorAberturas = 0; // Estado compartilhado!

    @Override
    public void abrir() {
        System.out.println("[Chamada via Interface BR: abrir()]");
        this.turnOn();
    }

    @Override
    public void fechar() {
        System.out.println("[Chamada via Interface BR: fechar()]");
        this.turnOff();
    }

    @Override
    public void turnOn() {
        if (aberta) {
        	System.out.println("-> A torneira já está aberta.");
        	return;
        }	
        this.aberta = true;
        this.contadorAberturas++;
        System.out.println("-> Torneira ABERTA! (Total de acionamentos no hidrômetro: " + contadorAberturas + ")");
    }

    @Override
    public void turnOff() {
        if (!aberta) {
        	System.out.println("-> A torneira já está fechada.");
        	return;
        }	
        this.aberta = false;
        System.out.println("-> Torneira FECHADA.");
    }

    public int getContadorAberturas() {
        return this.contadorAberturas;
    }
}