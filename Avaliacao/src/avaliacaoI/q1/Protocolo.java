package avaliacaoI.q1;

import avaliacaoI.base.ftp.FTPRequest;
import avaliacaoI.base.ftp.FTPResponse;

public interface Protocolo {
	
	public void open();
	public void message(Request request, Response response);
	public void close();

}
