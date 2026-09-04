package br.ifba.edu.inf011.passo3;

public class Moeda {

	private final String simbolo;
	private final double valor;

	public Moeda(String simbolo, double valor) {
		if (simbolo == null || simbolo.trim().isEmpty())
			throw new IllegalStateException("Símbolo é um dado obrigatório.");
		if (valor < 0)
			throw new IllegalStateException("O valor da moeda não pode ser negativo.");
		this.simbolo = simbolo;
		this.valor = valor;
	}

	public Moeda incrementarPercentual(double percentual) {
		if (percentual < 0)
			throw new IllegalArgumentException("O percentual de incrementro não pode ser negativo.");
		double valor = this.valor * (1+percentual);
		return new Moeda(this.simbolo, valor);
	}	
	
	public Moeda aumentar(double montante) {
		if (montante < 0)
			throw new IllegalArgumentException("O montante para aumento não pode ser negativo.");
		double valor = this.valor + montante;
		return new Moeda(this.simbolo, valor);		
	}

	public Moeda aumentar(Moeda outra) {
		if (outra == null)
			throw new IllegalArgumentException("Moeda para aumento não pode ser nula.");
		if (!this.simbolo.equalsIgnoreCase(outra.getSimbolo()))
			throw new IllegalArgumentException("Não é possível somar moedas de símbolos diferentes.");
		return this.aumentar(outra.getValor());
	}

	public Moeda diminuir(double montante) {
		if (montante < 0)
			throw new IllegalArgumentException("O montante para diminuição não pode ser negativo.");
		if (this.valor - montante < 0)
			throw new IllegalStateException("O valor resultante da moeda não pode ser negativo.");
		double valor = this.valor - montante;
		return new Moeda(this.simbolo, valor);			
	}

	public Moeda diminuir(Moeda outra) {
		if (outra == null)
			throw new IllegalArgumentException("Moeda para diminuição não pode ser nula.");
		if (!this.simbolo.equalsIgnoreCase(outra.getSimbolo()))
			throw new IllegalArgumentException("Não é possível subtrair moedas de símbolos diferentes.");
		return this.diminuir(outra.getValor());
	}

	public String getSimbolo() {
		return simbolo;
	}

	public double getValor() {
		return valor;
	}

	public String formatar() {
		return this.simbolo + " " + String.format("%.2f", this.valor);
	}

	@Override
	public String toString() {
		return this.formatar();
	}

	public Moeda multiplicar(double quantidade) {
		return new Moeda(this.simbolo, this.valor * quantidade);
	}
}
