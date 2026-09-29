package avaliacaoI.q1;

import avaliacaoI.base.http.HTTPProtocolo;
import avaliacaoI.base.http.HTTPRequest;
import avaliacaoI.base.http.HTTPResponse;

public class AppHTTP extends App{

	@Override
	protected Response createResponse() {
		return new HTTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new HTTPRequest();
	}

	@Override
	protected Protocolo createProtocol() {
		return new HTTPProtocolo("ftp.inf7011.ifba.edu.br", Integer.valueOf(21));
	}
	
	public static void main(String[] args) {
		new AppHTTP().run();
	}

}
