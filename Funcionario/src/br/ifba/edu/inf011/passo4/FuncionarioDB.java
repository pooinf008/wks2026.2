package br.ifba.edu.inf011.passo4;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioDB{
	
	private Map<String, Funcionario> database;

	public FuncionarioDB() {
		this.database = new HashMap<String, Funcionario>();
		this.init();
	}

	private void init() {
		Funcionario funcionario1 = new Funcionario("Ana Silva", "1", "Rua A", "Centro", "40000-000", "Salvador", "BA", Cargo.JUNIOR, new Moeda("R$", 75.00));
		Funcionario funcionario2 = new Funcionario("Bruno Souza", "2", "Rua B", "Pituba", "41000-000", "Salvador", "BA", Cargo.PLENO, new Moeda("R$", 62.00));
		Funcionario funcionario3 = new Funcionario("Carla Dias", "3", "Rua C", "Buraquinho", "42700-000", "Lauro de Freitas", "BA", Cargo.MENTOR, new Moeda("R$", 120.00));
		Funcionario funcionario4 = new Funcionario("Daniel Costa", "4", "Rua D", "Rio Vermelho", "41940-000", "Salvador", "BA", Cargo.SENIOR, new Moeda("R$", 94.00));
		Funcionario funcionario5 = new Funcionario("Elisa Mota", "5", "Rua E", "Vilas do Atlântico", "42700-000", "Lauro de Freitas", "BA", Cargo.TRAINEE, new Moeda("R$", 81.00));

		this.database.put(funcionario1.getMatricula(), funcionario1);
		this.database.put(funcionario2.getMatricula(), funcionario2);
		this.database.put(funcionario3.getMatricula(), funcionario3);
		this.database.put(funcionario4.getMatricula(), funcionario4);
		this.database.put(funcionario5.getMatricula(), funcionario5);
	}

	public Funcionario find(String matricula) {
		return this.database.get(matricula);
	}
	
	public void insert(Funcionario funcionario) {
		if (funcionario == null || funcionario.getMatricula() == null)
			throw new IllegalArgumentException("Funcionário ou matrícula não podem ser nulos.");
		if (this.database.containsKey(funcionario.getMatricula()))
			throw new IllegalArgumentException("Erro de restrição única: Já existe um funcionário com a matrícula " + 
											   funcionario.getMatricula());
		this.database.put(funcionario.getMatricula(), funcionario);
	}

	public Map<String, Funcionario> getDatabase() {
		return database;
	}
}