package br.ifba.edu.inf011.passo0;

public class Aplicacao {
	
	private FuncionarioDB funcionarioDB;
	
	public Aplicacao() {
		this.funcionarioDB = new FuncionarioDB();
	}	
	
	public void registarPonto(String matricula, int dia, double jornada) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		double[] jornadaDoMes = funcionario.getJornada();
		jornadaDoMes[dia] = jornada;
		funcionario.setJornada(jornadaDoMes);
	}
	
	public void gerarRelatorioHorasMensal(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		System.out.println("==================================================");
		System.out.println("Relatório de Horas - " + funcionario.getNome() + " (Matrícula: " + funcionario.getMatricula() + ")");
		System.out.println("==================================================");
		double[] jornadaDoMes = funcionario.getJornada();
		for (int dia = 0; dia < jornadaDoMes.length; dia++)
			if (jornadaDoMes[dia] > 0) 
				System.out.println("Dia " + dia + ": " + jornadaDoMes[dia] + " horas");
		System.out.println("==================================================");
		System.out.println("Total de Horas Trabalhadas: " + this.calcularTotalHoras(matricula));
		System.out.println("==================================================\n");
	}
	
	public double calcularTotalHoras(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		double[] jornadaDoMes = funcionario.getJornada();
		double total = 0;
		for (int dia = 0; dia < jornadaDoMes.length; dia++)
			total += jornadaDoMes[dia];
		return total;
	}
	
	public double calcularDescontoPrevidenciario(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		double totalHoras = this.calcularTotalHoras(matricula);
		return funcionario.getSalario() * totalHoras * 0.11; // Magic Number
	}
	
	public void imprimirContracheque(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		double totalHoras = this.calcularTotalHoras(matricula);
		double salarioBruto =  funcionario.getSalario() * totalHoras;
		double descontoPrevidenciario = this.calcularDescontoPrevidenciario(matricula); // Magic Number
		double salarioLiquido = salarioBruto - descontoPrevidenciario;
		
		String enderecoCompleto = funcionario.getRuaEndereco() + ", " + 
				funcionario.getBairroEndereco() + " - " + 
				funcionario.getCidadeEndereco() + "/" + 
				funcionario.getEstadoEndereco() + " CEP: " + 
				funcionario.getCepEndereco();
		
		System.out.println("==================================================");
		System.out.println("                  CONTRACHEQUE                    ");
		System.out.println("==================================================");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Endereço: " + enderecoCompleto);
		System.out.println("Total de Horas Trabalhadas: " + totalHoras + "h");
		System.out.println("--------------------------------------------------");
		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println("Desconto INSS (11%): R$ " + descontoPrevidenciario);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
		System.out.println("==================================================\n");
	}	
	
	public void aumentar(String matricula, double percentual) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		double salario = funcionario.getSalario();
		salario *= 1 + percentual;
		funcionario.setSalario(salario);
	}
	
	public void reiniciar(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		funcionario.setJornada(new double[30]);
	}	
	
	
	public void run() {
		this.registarPonto("1", 1, 8);
		this.registarPonto("1", 2, 9);
		this.gerarRelatorioHorasMensal("1");
		this.imprimirContracheque("1");
		this.reiniciar("1");
		this.aumentar("1", 0.1);
		this.registarPonto("1", 1, 8);
		this.registarPonto("1", 2, 9);
		this.gerarRelatorioHorasMensal("1");
		this.imprimirContracheque("1");
	}
	
	
	public static void main(String[] args) {
		new Aplicacao().run();
	}
	

}
