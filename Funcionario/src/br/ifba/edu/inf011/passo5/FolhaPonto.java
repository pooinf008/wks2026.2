package br.ifba.edu.inf011.passo5;

public class FolhaPonto {
	
	private static final int DIAS_MES = 30;
	private static final double JORNADA_MAXIMA = 10;
	private double[] jornada;
	
	public FolhaPonto() {
		this.reiniciar();
	}
	
	public void reiniciar() {
		this.jornada = new double[FolhaPonto.DIAS_MES]; 
	}
	
	public void registrarPonto(int dia, double horas) {
		if (dia < 0 || dia >= this.jornada.length) 
			throw new IndexOutOfBoundsException("Dia inválido: " + dia);
		if (horas < 0)
			throw new IllegalArgumentException("A quantidade de horas não pode ser negativa.");
		this.jornada[dia] = horas;
	}	
	
	public double calcularTotalHoras() {
		double total = 0;
		for (double horas : this.jornada)
			total += Math.min(horas, FolhaPonto.JORNADA_MAXIMA);
		return total;
	}
	
	public String imprimirDiasTrabalhados() {
		StringBuffer diasTrabalhados = new StringBuffer();
		for (int dia = 0; dia < this.jornada.length; dia++)
			this.adicionarHorasdoDia(diasTrabalhados, dia);
		return diasTrabalhados.toString();
	}
	
	private void  adicionarHorasdoDia(StringBuffer diasTrabalhados, Integer dia) {
		if (this.jornada[dia] > 0)
			diasTrabalhados.append("Dia " + dia + ": " + this.jornada[dia] + " horas\n");
	}
	
	

}
