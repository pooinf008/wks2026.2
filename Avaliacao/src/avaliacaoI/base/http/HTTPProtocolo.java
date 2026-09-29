package avaliacaoI.base.http;

import avaliacaoI.q1.Protocolo;
import avaliacaoI.q1.Request;
import avaliacaoI.q1.Response;

public class HTTPProtocolo implements Protocolo{

	private String host;
	private Integer port;
	
	public HTTPProtocolo(String host, Integer port) {
		this.host = host;
		this.port = port;
	}

	public void open() {
		System.out.println("Abrindo HTTP em " + this.host + ":" + this.port);
	}

	public void message(Request httpRequest, Response httpResponse) {
		System.out.println("Trocando mensagem HTTP...");
	}
	
	public void close() {
		System.out.println("Fechando Conexão HTTP.");
	}
	

}
