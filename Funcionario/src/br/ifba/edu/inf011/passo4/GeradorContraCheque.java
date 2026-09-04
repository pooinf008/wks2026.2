package br.ifba.edu.inf011.passo4;

public class GeradorContraCheque {
	
	private static final double TAXA_INSS = 0.11;
	
	public ContraCheque gerar(Funcionario funcionario) {
		Contrato contrato = funcionario.getContrato();
		double horasTrabalhadas = funcionario.calcularTotalHoras();
		Moeda salario = contrato.getSalario();
		Moeda salarioBruto =  this.calcularSalarioBruto(salario, horasTrabalhadas);
		Moeda descontoPrevidenciario = this.calcularDescontoPrevidenciario(salarioBruto);
		Moeda salarioLiquido = this.calcularSalarioLiquido(salarioBruto, descontoPrevidenciario);
		return new ContraCheque(funcionario.getNome(), funcionario.getMatricula(), 
				                funcionario.getEnderecoFormatado(), String.format("%.2f", horasTrabalhadas), 
				                salarioBruto.toString(), descontoPrevidenciario.toString(), salarioLiquido.toString());
	}
	
	private Moeda calcularSalarioBruto(Moeda salario, double horasTrabalhadas) {
		return salario.multiplicar(horasTrabalhadas);
	}	
	
	private Moeda calcularDescontoPrevidenciario(Moeda salarioBruto) {
		return salarioBruto.multiplicar(GeradorContraCheque.TAXA_INSS); 
	}	
	
	private Moeda calcularSalarioLiquido(Moeda salarioBruto, Moeda descontoPrevidenciario) {
		return salarioBruto.diminuir(descontoPrevidenciario);
	}		
	

}
