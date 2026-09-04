package br.ifba.edu.inf011.passo6;

public class FolhaPonto {
	
	private static final int DIAS_MES = 30;
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
	
	public  Integer tamanhoMes() {
		return this.jornada.length;
	}
	
	public double getHoras(int dia) {
		return this.jornada[dia];
	}			
	
	

}
