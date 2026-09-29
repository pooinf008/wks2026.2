package avaliacaoI.q2;

import avaliacaoI.q1.Protocolo;

public class App {
	
	private ProtocoloAbstractFactory factory;
	
	public App(ProtocoloAbstractFactory factory) {
		this.factory = factory;
	}
	
	public void run() {
		Protocolo protocolo = this.factory.createProtocol();
		protocolo.open();
		protocolo.message(this.factory.createRequest(), this.factory.createResponse());
		protocolo.close();
	}
	
	
	public static void main(String[] args) {
		new App(new HTTPConcreteFactory()).run();
	}
	



}
