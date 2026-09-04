package br.ifba.edu.inf011.passo6;

public class GeradorRelatorioHorasTrabalhadas {
	
	public RelatorioHorasTrabalhadas gerar(Funcionario funcionario) {
		return new RelatorioHorasTrabalhadas(funcionario.getDadosPessoais(), funcionario.getFolhaPonto());
	}

}
