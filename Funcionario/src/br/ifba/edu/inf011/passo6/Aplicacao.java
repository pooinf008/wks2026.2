package br.ifba.edu.inf011.passo6;

//APLICADO TDA e FAIL FAST
//APLICADO FIRST CLASS COLLECTION
//APLICADO SMALL ENTITIES
//APLICANDO CALISTENIA AO LIMITE
//DEMONSTRANDO A QUEBRA DO SRP (SOLID) - UMA MUDANÇA DE REQUISITOS
/***
 * O setor de pagamento informou que no novo acordo coletivo, limitou o pagamento a 10 horas no dia. o resto irá para banco de horas
 */

public class Aplicacao {
	
	private FuncionarioDB funcionarioDB;
	
	public Aplicacao() {
		this.funcionarioDB = new FuncionarioDB();
	}	

	public void registarPonto(String matricula, int dia, double jornada) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		if (funcionario == null)
			throw new IllegalArgumentException("Funcionário não encontrado para a matrícula: " + matricula);
		funcionario.registrarPonto(dia, jornada);
	}
	
	public void imprimirRelatorioHorasMensal(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		if (funcionario == null)
			throw new IllegalArgumentException("Funcionário não encontrado para a matrícula: " + matricula);

		
		GeradorRelatorioHorasTrabalhadas geradorRelatorio = new GeradorRelatorioHorasTrabalhadas();
		System.out.println(geradorRelatorio.gerar(funcionario).format());
	}
	
	public void imprimirContraCheque(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		if (funcionario == null)
			throw new IllegalArgumentException("Funcionário não encontrado para a matrícula: " + matricula);
		
		GeradorContraCheque gerador = new GeradorContraCheque();
		System.out.println(gerador.gerar(funcionario).formatar());
	}		
	
	public void aumentar(String matricula, double percentual) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		funcionario.aumentar(0.1);
	}
	
	public void reiniciar(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		funcionario.reiniciarMes();
	}		
	
	public void run() {
		this.registarPonto("1", 1, 8);
		this.registarPonto("1", 2, 9);
		this.registarPonto("1", 3, 11);
		this.imprimirRelatorioHorasMensal("1");
		this.imprimirContraCheque("1");
		this.reiniciar("1");
		this.aumentar("1", 0.1);
		this.registarPonto("1", 1, 8);
		this.registarPonto("1", 2, 9);
		this.registarPonto("1", 3, 11);
		this.imprimirRelatorioHorasMensal("1");
		this.imprimirContraCheque("1");
	}
	
	public static void main(String[] args) {
		new Aplicacao().run();
	}
}