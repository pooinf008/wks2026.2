package br.ifba.edu.inf011.passo5;


public class Contrato {
	private Cargo cargo;
	private Moeda salario;
	
	public Contrato(Cargo cargo, Moeda salario) {
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Contrato(Cargo cargo, double valorSalario) {
		this(cargo, new Moeda("R$", valorSalario));
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	private void setCargo(Cargo cargo) {
		if (cargo == null)
			throw new IllegalStateException("Cargo é um dado obrigatório.");
		this.cargo = cargo;
	}
	
	public Moeda getSalario() {
		return salario;
	}
	
	private void setSalario(Moeda salario) {
		if (salario == null)
			throw new IllegalStateException("Salário é um dado obrigatório.");
		this.salario = salario;
	}
	
	public void aumentar(double percentual) {
		this.setSalario(this.salario.incrementarPercentual(percentual));
	}
	
	public void aumentarSalario(double montante) {
		this.setSalario(this.salario.aumentar(montante));
	}
	
	public void diminuirSalario(double montante) {
		this.setSalario(this.salario.diminuir(montante));
	}
	
}