package br.ifba.edu.inf011.passo6;


public class CalculadoraHorasPagaveis {

	private static final double JORNADA_MAXIMA = 10;

	public double calcular(FolhaPonto folhaPonto) {
		double total = 0;
		for(int dias = 0; dias < folhaPonto.tamanhoMes(); dias++)
			total += Math.min(folhaPonto.getHoras(dias), CalculadoraHorasPagaveis.JORNADA_MAXIMA);
		return total;
		
	}
	
	
}
