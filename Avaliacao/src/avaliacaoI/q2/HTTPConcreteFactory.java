package avaliacaoI.q2;

import avaliacaoI.base.http.HTTPProtocolo;
import avaliacaoI.base.http.HTTPRequest;
import avaliacaoI.base.http.HTTPResponse;
import avaliacaoI.q1.Protocolo;
import avaliacaoI.q1.Request;
import avaliacaoI.q1.Response;

public class HTTPConcreteFactory implements ProtocoloAbstractFactory {

	@Override
	public Response createResponse() {
		return new HTTPResponse();
	}

	@Override
	public Request createRequest() {
		return new HTTPRequest();
	}

	@Override
	public Protocolo createProtocol() {
		return new HTTPProtocolo("http://localhost", 80);
	}

}
