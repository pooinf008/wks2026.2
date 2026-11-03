package br.edu.ifba.inf011.estrutural.composite.implementacao2;

public interface Component {
	public void execute();
    public Component add(Component child);
}
