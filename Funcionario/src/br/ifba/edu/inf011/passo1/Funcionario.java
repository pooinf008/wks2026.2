package br.ifba.edu.inf011.passo1;


public class Funcionario {
	
	
	private static final double TAXA_INSS = 0.11;
	
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
		this.reiniciarMes();
	}
	
	public void reiniciarMes() {
		this.jornada = new double[30];
	}

	public void registrarPonto(int dia, double horas) {
		if (dia < 0 || dia >= this.jornada.length) 
			throw new IndexOutOfBoundsException("Dia inválido: " + dia);
		if (horas < 0)
			throw new IllegalArgumentException("A quantidade de horas não pode ser negativa.");
		
		this.jornada[dia] = horas;
	}

	public double calcularTotalHoras() {
		double total = 0;
		for (double h : this.jornada) {
			total += h;
		}
		return total;
	}

	public String imprimirDiasTrabalhados() {
		StringBuffer diasTrabalhados = new StringBuffer();
		for (int dia = 0; dia < this.jornada.length; dia++)
			if (this.jornada[dia] > 0)
				diasTrabalhados.append("Dia " + dia + ": " + this.jornada[dia] + " horas\n");
		return diasTrabalhados.toString();
	}
	
	
	public String gerarRelatorioHorasMensal() {
		StringBuffer relatorioHoras = new StringBuffer();
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Relatório de Horas - " + this.getNome() + " (Matrícula: " + this.getMatricula() + ")\n");
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append(this.imprimirDiasTrabalhados());
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Total de Horas Trabalhadas: " + this.calcularTotalHoras() + "\n");
		relatorioHoras.append("==================================================\n");
		return relatorioHoras.toString();
	}	
	
	public String gerarContracheque() {
		double totalHoras = this.calcularTotalHoras();
		double salarioBruto =  this.getSalario() * totalHoras;
		double descontoPrevidenciario = this.calcularDescontoPrevidenciario();
		double salarioLiquido = salarioBruto - descontoPrevidenciario;
		
		String enderecoCompleto = this.getRuaEndereco() + ", " + 
				this.getBairroEndereco() + " - " + 
				this.getCidadeEndereco() + "/" + 
				this.getEstadoEndereco() + " CEP: " + 
				this.getCepEndereco();
		
		StringBuffer contraCheque = new StringBuffer();
		
		contraCheque.append("==================================================\n");
		contraCheque.append("                  CONTRACHEQUE                    \n");
		contraCheque.append("==================================================\n");
		contraCheque.append("Nome: " + this.getNome()+"\n");
		contraCheque.append("Matrícula: " + this.getMatricula() +"\n");
		contraCheque.append("Endereço: " + enderecoCompleto+"\n");
		contraCheque.append("Total de Horas Trabalhadas: " + totalHoras + "h\n");
		contraCheque.append("--------------------------------------------------\n");
		contraCheque.append("Salário Bruto: R$ " + salarioBruto + "\n");
		contraCheque.append("Desconto INSS (11%): R$ " + descontoPrevidenciario+ "\n");
		contraCheque.append("Salário Líquido: R$ " + salarioLiquido + "\n");
		contraCheque.append("==================================================\n");
		return contraCheque.toString();
	}	
	
	
	public double calcularSalarioBruto() {
		return this.getSalario() * this.calcularTotalHoras();
	}	
	
	public double calcularDescontoPrevidenciario() {
		return this.calcularSalarioBruto() * Funcionario.TAXA_INSS; 
	}	
	
	public double calcularSalarioLiquido() {
		return this.calcularSalarioBruto() - this.calcularDescontoPrevidenciario();
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

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	private void setRuaEndereco(String ruaEndereco) {
		if (ruaEndereco == null)
			throw new IllegalStateException("Rua é um dado obrigatório.");
		this.ruaEndereco = ruaEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	private void setBairroEndereco(String bairroEndereco) {
		if (bairroEndereco == null)
			throw new IllegalStateException("Bairro é um dado obrigatório.");
		
		this.bairroEndereco = bairroEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	private void setCepEndereco(String cepEndereco) {
		if (cepEndereco == null)
			throw new IllegalStateException("CEP é um dado obrigatório.");
		this.cepEndereco = cepEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	private void setCidadeEndereco(String cidadeEndereco) {
		if (cidadeEndereco == null)
			throw new IllegalStateException("Cidade é um dado obrigatório.");
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getEstadoEndereco() {
		return estadoEndereco;
	}

	private void setEstadoEndereco(String estadoEndereco) {
		if (estadoEndereco == null)
			throw new IllegalStateException("Estado é um dado obrigatório.");		
		this.estadoEndereco = estadoEndereco;
	}

	public String getCargo() {
		return cargo;
	}

	private void setCargo(String cargo) {
		if (cargo == null)
			throw new IllegalStateException("Cargo é um dado obrigatório.");				
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		if (this.salario < 0)
			throw new IllegalStateException("O valor da hora (salário) não pode ser negativo.");
		this.salario = salario;
	}

	public double[] getJornada() {
		return jornada;
	}

	public void aumentar(double percentual) {
		double salarioAtual = this.getSalario();
		salarioAtual = (1+percentual);
		this.setSalario(salarioAtual);
	}

}