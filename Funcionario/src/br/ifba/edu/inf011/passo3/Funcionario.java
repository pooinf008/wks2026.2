package br.ifba.edu.inf011.passo3;

public class Funcionario {
	
	private static final double TAXA_INSS = 0.11;
	
	private String nome;
	private String matricula;
	private Endereco endereco;
	private Cargo cargo;
	private Moeda salario;
	
	public FolhaPonto folhaPonto;
	
	public Funcionario(String nome, String matricula, String rua, String bairro, String cep,
				       String cidade, String estado, Cargo cargo, Moeda salario) {
		super();
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCargo(cargo);
		this.setSalario(salario);
		this.endereco = new Endereco(rua, bairro, cep, cidade, estado);
		this.folhaPonto = new FolhaPonto();
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
	
	
	public String gerarRelatorioHorasMensal() {
		RelatorioHorasTrabalhadas relatorio = new RelatorioHorasTrabalhadas(this);
		return relatorio.gerarRelatorioHorasMensal();
	}	
	
	public String gerarContracheque() {
		ContraCheque contraCheque = new ContraCheque(this);
		return contraCheque.formatar();
	}	
	
	
	public Moeda calcularSalarioBruto() {
		return this.getSalario().multiplicar(this.calcularTotalHoras());
	}	
	
	public Moeda calcularDescontoPrevidenciario() {
		return this.calcularSalarioBruto().multiplicar(Funcionario.TAXA_INSS); 
	}	
	
	public Moeda calcularSalarioLiquido() {
		return this.calcularSalarioBruto().diminuir(this.calcularDescontoPrevidenciario());
	}	
	
	public void aumentarSalario(double montante) {
		this.salario.aumentar(montante);
	}

	public void diminuirSalario(double montante) {
		this.salario.diminuir(montante);
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		if (nome == null)
			throw new IllegalStateException("Nome é um dado obrigatório.");
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	private void setMatricula(String matricula) {
		if (matricula == null)
			throw new IllegalStateException("Matricula é um dado obrigatório.");
		this.matricula = matricula;
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
		this.setSalario(this.getSalario().incrementarPercentual(percentual));
	}	
	
	public String getEnderecoFormatado() {
		return this.endereco.formatar();
	}
	
	public Moeda getSalarioBruto() {
		return  this.getSalario().multiplicar(this.calcularTotalHoras());
	}


}