package br.ifba.edu.inf011.passo0;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioDB{
	
	private Map<String, Funcionario> database;

	public FuncionarioDB() {
		this.database = new HashMap<String, Funcionario>();
		this.init();
	}

	private void init() {
		Funcionario f1 = new Funcionario("Ana Silva", "1", "Rua A", "Centro", "40000-000", "Salvador", "BA", "Desenvolvedora", 75.00);
		Funcionario f2 = new Funcionario("Bruno Souza", "2", "Rua B", "Pituba", "41000-000", "Salvador", "BA", "Analista de Dados", 62.00);
		Funcionario f3 = new Funcionario("Carla Dias", "3", "Rua C", "Buraquinho", "42700-000", "Lauro de Freitas", "BA", "Gerente de TI", 120.00);
		Funcionario f4 = new Funcionario("Daniel Costa", "4", "Rua D", "Rio Vermelho", "41940-000", "Salvador", "BA", "Engenheiro de Software", 94.00);
		Funcionario f5 = new Funcionario("Elisa Mota", "5", "Rua E", "Vilas do Atlântico", "42700-000", "Lauro de Freitas", "BA", "DevOps", 81.00);

		this.database.put(f1.getMatricula(), f1);
		this.database.put(f2.getMatricula(), f2);
		this.database.put(f3.getMatricula(), f3);
		this.database.put(f4.getMatricula(), f4);
		this.database.put(f5.getMatricula(), f5);
	}

	public Funcionario find(String matricula) {
		return this.database.get(matricula);
	}
	
	public void insert(Funcionario funcionario) {
		if (funcionario == null || funcionario.getMatricula() == null)
			throw new IllegalArgumentException("Funcionário ou matrícula não podem ser nulos.");
		else if (this.database.containsKey(funcionario.getMatricula()))
			throw new IllegalArgumentException("Erro de restrição única: Já existe um funcionário com a matrícula " + 
											   funcionario.getMatricula());
		else
			this.database.put(funcionario.getMatricula(), funcionario);
	}

	public Map<String, Funcionario> getDatabase() {
		return database;
	}
}