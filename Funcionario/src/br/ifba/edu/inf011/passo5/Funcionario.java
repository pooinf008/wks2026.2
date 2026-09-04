package br.ifba.edu.inf011.passo5;

public class Funcionario {
	

	
	private DadosPessoais dadosPessoais;
	private Endereco endereco;
	private Contrato contrato;
	
	public FolhaPonto folhaPonto;

	public Funcionario(DadosPessoais dadosPessoais, Endereco endereco, Contrato contrato) {
		super();
		this.setDadosPessoais(dadosPessoais);
		this.setEndereco(endereco);
		this.setContrato(contrato);
		this.folhaPonto = new FolhaPonto();
	}
	
	public Funcionario(String nome, String matricula, String rua, String bairro, String cep,
				       String cidade, String estado, Cargo cargo, Moeda salario) {
		this(new DadosPessoais(nome, matricula),
		     new Endereco(rua, bairro, cep, cidade, estado),
		     new Contrato(cargo, salario));
	}

	public Funcionario(String nome, String matricula, String rua, String bairro, String cep,
				       String cidade, String estado, Cargo cargo, double valorSalario) {
		this(nome, matricula, rua, bairro, cep, cidade, estado, cargo, new Moeda("R$", valorSalario));
	}
	
	public void reiniciarMes() {
		this.folhaPonto.reiniciar();
	}

	public void registrarPonto(int dia, double horas) {
		this.folhaPonto.registrarPonto(dia, horas);
	}

	public double calcularTotalHoras() {
		return this.folhaPonto.calcularTotalHoras();
	}

	public String imprimirDiasTrabalhados() {
		return this.folhaPonto.imprimirDiasTrabalhados();
	}
	
	public void aumentarSalario(double montante) {
		this.contrato.aumentarSalario(montante);
	}

	public void diminuirSalario(double montante) {
		this.contrato.diminuirSalario(montante);
	}

	public String getNome() {
		return this.dadosPessoais.getNome();
	}

	public String getMatricula() {
		return this.dadosPessoais.getMatricula();
	}

	public Cargo getCargo() {
		return this.contrato.getCargo();
	}

	public Moeda getSalario() {
		return this.contrato.getSalario();
	}
	
	public void aumentar(double percentual) {
		this.contrato.aumentar(percentual);
	}	
	
	public String getEnderecoFormatado() {
		return this.endereco.formatar();
	}
	
	public Moeda getSalarioBruto() {
		return this.getSalario().multiplicar(this.calcularTotalHoras());
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	private void setDadosPessoais(DadosPessoais dadosPessoais) {
		if (dadosPessoais == null)
			throw new IllegalStateException("Dados pessoais são obrigatórios.");
		this.dadosPessoais = dadosPessoais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	private void setEndereco(Endereco endereco) {
		if (endereco == null)
			throw new IllegalStateException("Endereço é um dado obrigatório.");
		this.endereco = endereco;
	}

	public Contrato getContrato() {
		return contrato;
	}
	
	public FolhaPonto getFolhaPonto() {
		return this.folhaPonto;
	}
	

	private void setContrato(Contrato contrato) {
		if (contrato == null)
			throw new IllegalStateException("Contrato é obrigatório.");
		this.contrato = contrato;
	}
}