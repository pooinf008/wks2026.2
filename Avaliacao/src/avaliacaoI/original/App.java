package avaliacaoI.original;

import avaliacaoI.base.ftp.FTPProtocolo;
import avaliacaoI.base.ftp.FTPRequest;
import avaliacaoI.base.ftp.FTPResponse;
import avaliacaoI.base.http.HTTPProtocolo;
import avaliacaoI.base.http.HTTPRequest;
import avaliacaoI.base.http.HTTPResponse;

public class App {
	
	
	public void run(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.FTP) {
			FTPProtocolo ftp = new FTPProtocolo("ftp.inf7011.ifba.edu.br", Integer.valueOf(21));
			ftp.open();
			ftp.message(new FTPRequest(), new FTPResponse());
			ftp.close();
		}else if(tipo == TipoProtocolo.HTTP) {
			HTTPProtocolo http = new HTTPProtocolo("http.inf011.ifba.edu.br", Integer.valueOf(21));
			http.open();
			http.message(new HTTPRequest(), new HTTPResponse());
			http.close();
		}		
	}
	
	public static void main(String[] args) {
		new App().run(TipoProtocolo.HTTP);
	}

}
