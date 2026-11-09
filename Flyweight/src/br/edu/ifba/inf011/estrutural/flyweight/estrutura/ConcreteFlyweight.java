package br.edu.ifba.inf011.estrutural.flyweight.estrutura;

/**
 * PARTICIPANTE: ConcreteFlyweight (GoF)
 * Implementa a interface Flyweight e adiciona espaço para armazenar
 * o estado intrínseco (intrinsicState), se houver.
 * Um objeto ConcreteFlyweight deve ser compartilhável. Qualquer estado
 * que ele armazene deve ser intrínseco; isto é, independente de seu contexto.
 */
public class ConcreteFlyweight implements Flyweight {

    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight [" + System.identityHashCode(this) + "]: "
                + "intrinsicState = '" + this.intrinsicState + "', "
                + "extrinsicState = '" + extrinsicState + "'");
    }

    public String getIntrinsicState() {
        return this.intrinsicState;
    }
}
