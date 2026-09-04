package br.ifba.edu.inf011.passo3;

public class ContraCheque {
	
	private Funcionario funcionario;
	
	public ContraCheque(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	public String formatar() {
		double totalHoras = funcionario.calcularTotalHoras();
		Moeda salarioBruto =  funcionario.calcularSalarioBruto();
		Moeda descontoPrevidenciario = funcionario.calcularDescontoPrevidenciario();
		Moeda salarioLiquido = funcionario.calcularSalarioLiquido();

		StringBuffer contraCheque = new StringBuffer();
		contraCheque.append("==================================================\n");
		contraCheque.append("                  CONTRACHEQUE                    \n");
		contraCheque.append("==================================================\n");
		contraCheque.append("Nome: " + funcionario.getNome()+"\n");
		contraCheque.append("Matrícula: " + funcionario.getMatricula() +"\n");
		contraCheque.append("Endereço: " +  funcionario.getEnderecoFormatado() +"\n");
		contraCheque.append("Total de Horas Trabalhadas: " + totalHoras + "h\n");
		contraCheque.append("--------------------------------------------------\n");
		contraCheque.append("Salário Bruto: " + salarioBruto + "\n");
		contraCheque.append("Desconto INSS (11%): " + descontoPrevidenciario + "\n");
		contraCheque.append("Salário Líquido: " + salarioLiquido + "\n");
		contraCheque.append("==================================================\n");
		return contraCheque.toString();		
	}
	

}
