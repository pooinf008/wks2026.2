package br.edu.ifba.inf011.estrutural.composite.implementacao2;


public class Client {
	
	public void run() {
        Component c1 = new Leaf("Arquivo A.txt");
        Component c2 = new Leaf("Arquivo B.txt");

        Component estrutura = c1.add(c2); 

        estrutura = estrutura.add(new Leaf("Arquivo C.txt"));

        estrutura.execute();
	}
	
    public static void main(String[] args) {
    	new Client().run();
    }
}