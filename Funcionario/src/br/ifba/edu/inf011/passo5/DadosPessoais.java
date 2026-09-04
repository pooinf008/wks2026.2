package br.ifba.edu.inf011.passo5;

public class DadosPessoais {

	private final String nome;
	private final String matricula;

	public DadosPessoais(String nome, String matricula) {
		if (nome == null)
			throw new IllegalStateException("Nome é um dado obrigatório.");
		if (matricula == null)
			throw new IllegalStateException("Matricula é um dado obrigatório.");
		this.nome = nome;
		this.matricula = matricula;		
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
