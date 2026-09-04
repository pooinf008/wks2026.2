package br.ifba.edu.inf011.passo6;

public class ContraCheque {
	
	private final String nome;
	private final String matricula;
	private final String endereco;
	private final String totalHoras;
	private final String salarioBruto;
	private final String descontoPrevidenciario;
	private final String salarioLiquido;
	
	public ContraCheque(String nome, String matricula, String endereco, String totalHoras, String salarioBruto,
			String descontoPrevidenciario, String salarioLiquido) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.totalHoras = totalHoras;
		this.salarioBruto = salarioBruto;
		this.descontoPrevidenciario = descontoPrevidenciario;
		this.salarioLiquido = salarioLiquido;
	}

	public String formatar() {

		StringBuffer contraCheque = new StringBuffer();
		contraCheque.append("==================================================\n");
		contraCheque.append("                  CONTRACHEQUE                    \n");
		contraCheque.append("==================================================\n");
		contraCheque.append("Nome: " + this.nome + "\n");
		contraCheque.append("Matrícula: " + this.matricula +"\n");
		contraCheque.append("Endereço: " +  this.endereco +"\n");
		contraCheque.append("Total de Horas Trabalhadas: " + this.totalHoras + "h\n");
		contraCheque.append("--------------------------------------------------\n");
		contraCheque.append("Salário Bruto: " + this.salarioBruto + "\n");
		contraCheque.append("Desconto INSS (11%): " + this.descontoPrevidenciario + "\n");
		contraCheque.append("Salário Líquido: " + this.salarioLiquido + "\n");
		contraCheque.append("==================================================\n");
		return contraCheque.toString();		
	}	
	

}
