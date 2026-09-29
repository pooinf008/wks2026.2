package avaliacaoI.q1;

import avaliacaoI.base.ftp.FTPProtocolo;
import avaliacaoI.base.ftp.FTPRequest;
import avaliacaoI.base.ftp.FTPResponse;

public class AppFTP extends App{

	@Override
	protected Response createResponse() {
		return new FTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new FTPRequest();
	}

	@Override
	protected Protocolo createProtocol() {
		return new FTPProtocolo("ftp.inf7011.ifba.edu.br", Integer.valueOf(21));
	}
	
	public static void main(String[] args) {
		new AppFTP().run();
	}

}
