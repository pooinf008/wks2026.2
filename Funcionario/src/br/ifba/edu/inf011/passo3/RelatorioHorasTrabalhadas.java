package br.ifba.edu.inf011.passo3;

public class RelatorioHorasTrabalhadas {
	
	private Funcionario funcionario;
	
	public RelatorioHorasTrabalhadas(Funcionario funcionario) {
		this.funcionario = funcionario;
	}	
	
	public String gerarRelatorioHorasMensal() {
		StringBuffer relatorioHoras = new StringBuffer();
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Relatório de Horas - " + funcionario.getNome() + " (Matrícula: " + funcionario.getMatricula() + ")\n");
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append(funcionario.imprimirDiasTrabalhados());
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Total de Horas Trabalhadas: " + funcionario.calcularTotalHoras() + "\n");
		relatorioHoras.append("==================================================\n");
		return relatorioHoras.toString();
	}	
		

}
