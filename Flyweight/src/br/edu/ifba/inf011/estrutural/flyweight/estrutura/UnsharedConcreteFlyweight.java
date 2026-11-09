package br.edu.ifba.inf011.estrutural.flyweight.estrutura;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: UnsharedConcreteFlyweight (GoF)
 * Nem todas as subclasses de Flyweight precisam ser compartilhadas.
 * A interface Flyweight habilita o compartilhamento, mas não o força.
 * É comum que objetos UnsharedConcreteFlyweight tenham objetos
 * ConcreteFlyweight como filhos em algum nível na estrutura do objeto flyweight.
 * Armazena todo o estado (allState), inclusive estado que não é compartilhado.
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private String allState;
    private final List<Flyweight> flyweights = new ArrayList<>();

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    public void add(Flyweight flyweight) {
        this.flyweights.add(flyweight);
    }

    public void remove(Flyweight flyweight) {
        this.flyweights.remove(flyweight);
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight [" + System.identityHashCode(this) + "]: "
                + "allState = '" + this.allState + "', "
                + "extrinsicState = '" + extrinsicState + "'");
        for (Flyweight flyweight : this.flyweights) {
            flyweight.operation(extrinsicState);
        }
    }

    public String getAllState() {
        return this.allState;
    }

    public void setAllState(String allState) {
        this.allState = allState;
    }
}
