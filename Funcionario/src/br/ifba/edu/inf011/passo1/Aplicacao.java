package br.ifba.edu.inf011.passo1;

//APLICADO TDA e FAIL FAST

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
		System.out.println(funcionario.gerarRelatorioHorasMensal());
	}
	
	public double calcularTotalHoras(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		if (funcionario == null)
			throw new IllegalArgumentException("Funcionário não encontrado para a matrícula: " + matricula);
		return funcionario.calcularTotalHoras();
	}	
	
	public void imprimirContraCheque(String matricula) {
		Funcionario funcionario = this.funcionarioDB.find(matricula);
		if (funcionario == null)
			throw new IllegalArgumentException("Funcionário não encontrado para a matrícula: " + matricula);
		System.out.println(funcionario.gerarContracheque());
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
		this.imprimirRelatorioHorasMensal("1");
		this.imprimirContraCheque("1");
		this.reiniciar("1");
		this.aumentar("1", 0.1);
		this.registarPonto("1", 1, 8);
		this.registarPonto("1", 2, 9);
		this.imprimirRelatorioHorasMensal("1");
		this.imprimirContraCheque("1");
	}		
	
	public static void main(String[] args) {
		new Aplicacao().run();
	}
}