package avaliacaoI.base.ftp;

import avaliacaoI.q1.Protocolo;
import avaliacaoI.q1.Request;
import avaliacaoI.q1.Response;

public class FTPProtocolo implements Protocolo{

	private String host;
	private Integer port;
	
	public FTPProtocolo(String host, Integer port) {
		this.host = host;
		this.port = port;
	}

	public void open() {
		System.out.println("Abrindo FTP em " + this.host + ":" + this.port);
	}
	
	public void close() {
		System.out.println("Fechando Conexão FTP.");
	}

	@Override
	public void message(Request request, Response response) {
		System.out.println("Trocando mensagem FTP...");
	}
	

}
