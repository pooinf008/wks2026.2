package br.ifba.edu.inf011.passo6;

public class CalculadoraHorasTrabalhadas {
	
	public double calcular(FolhaPonto folhaPonto) {

		double total = 0;
		for(int dias = 0; dias < folhaPonto.tamanhoMes(); dias++)
			total += folhaPonto.getHoras(dias);
		return total;
		
	}
	
}
