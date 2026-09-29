package avaliacaoI.q2;

import avaliacaoI.q1.Protocolo;
import avaliacaoI.q1.Request;
import avaliacaoI.q1.Response;

public interface ProtocoloAbstractFactory {
	
	public Response createResponse();
	public Request createRequest();
	public Protocolo createProtocol();	

}
