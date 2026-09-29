package avaliacaoI.q2;

import avaliacaoI.base.ftp.FTPProtocolo;
import avaliacaoI.base.ftp.FTPRequest;
import avaliacaoI.base.ftp.FTPResponse;
import avaliacaoI.q1.Protocolo;
import avaliacaoI.q1.Request;
import avaliacaoI.q1.Response;

public class FTPConcreteFactory implements ProtocoloAbstractFactory {

	@Override
	public Response createResponse() {
		return new FTPResponse();
	}

	@Override
	public Request createRequest() {
		return new FTPRequest();
	}

	@Override
	public Protocolo createProtocol() {
		return new FTPProtocolo("ftp://localhost", 10);
	}

}
