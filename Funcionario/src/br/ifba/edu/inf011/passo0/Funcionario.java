package br.ifba.edu.inf011.passo0;

public class Funcionario {
	
	private String nome;
	private String matricula;
	
	private String ruaEndereco;
	private String bairroEndereco;
	private String cepEndereco;
	private String cidadeEndereco;
	private String estadoEndereco;
	
	private String cargo;
	private double salario;
	
	private double[] jornada;
	
	
	public Funcionario(String nome, String matricula, String ruaEndereco, String bairroEndereco, String cepEndereco,
			String cidadeEndereco, String estadoEndereco, String cargo, double salario) {
		super();
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setRuaEndereco(ruaEndereco);
		this.setBairroEndereco(bairroEndereco);
		this.setCepEndereco(cepEndereco);
		this.setCidadeEndereco(cidadeEndereco);
		this.setEstadoEndereco(estadoEndereco);
		this.setCargo(cargo);
		this.setSalario(salario);
		this.setJornada(new double[30]);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getEstadoEndereco() {
		return estadoEndereco;
	}

	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double[] getJornada() {
		return jornada;
	}

	public void setJornada(double[] jornada) {
		this.jornada = jornada;
	}
	
	
	
	
	

}
