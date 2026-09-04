package br.ifba.edu.inf011.passo3;

public class Endereco {

	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public Endereco(String rua, String bairro, String cep, String cidade, String estado) {
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCep(cep);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	
	public String formatar() {
		return this.rua + ", " + this.bairro + " - " + 
			   this.cidade + "/" + this.estado + " CEP: " + this.cep;
	}

	private void setRua(String rua) {
		if (rua == null) throw new IllegalStateException("Rua é um dado obrigatório.");
		this.rua = rua;
	}

	private void setBairro(String bairro) {
		if (bairro == null) throw new IllegalStateException("Bairro é um dado obrigatório.");
		this.bairro = bairro;
	}

	private void setCep(String cep) {
		if (cep == null) throw new IllegalStateException("CEP é um dado obrigatório.");
		this.cep = cep;
	}

	private void setCidade(String cidade) {
		if (cidade == null) throw new IllegalStateException("Cidade é um dado obrigatório.");
		this.cidade = cidade;
	}

	private void setEstado(String estado) {
		if (estado == null) throw new IllegalStateException("Estado é um dado obrigatório.");
		this.estado = estado;
	}
}
