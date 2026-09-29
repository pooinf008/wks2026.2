package avaliacaoI.q1;

public abstract class App {
	
	
	public void run() {
		Protocolo protocolo = this.createProtocol();
		protocolo.open();
		protocolo.message(this.createRequest(), this.createResponse());
		protocolo.close();
	}
	
	protected abstract Response createResponse();
	protected abstract Request createRequest();
	protected abstract Protocolo createProtocol();


}
