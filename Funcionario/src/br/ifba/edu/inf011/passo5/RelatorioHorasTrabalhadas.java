package br.ifba.edu.inf011.passo5;

public class RelatorioHorasTrabalhadas {
	
	private String nome;
	private String matricula;
	private FolhaPonto folhaPonto;
	
	public RelatorioHorasTrabalhadas(DadosPessoais dados, FolhaPonto folhaPonto) {
		this.nome = dados.getNome();
		this.matricula = dados.getMatricula();
		this.folhaPonto = folhaPonto;
	}	
	
	public String format() {
		StringBuffer relatorioHoras = new StringBuffer();
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Relatório de Horas - " + this.nome + " (Matrícula: " + this.matricula + ")\n");
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append(this.folhaPonto.imprimirDiasTrabalhados());
		relatorioHoras.append("==================================================\n");
		relatorioHoras.append("Total de Horas Trabalhadas: " + this.folhaPonto.calcularTotalHoras() + "\n");
		relatorioHoras.append("==================================================\n");
		return relatorioHoras.toString();
	}	
		

}
