package br.edu.ifba.inf011.estrutural.decorator.estrutura;

/**
 * PARTICIPANTE: ConcreteComponent (GoF)
 * Define um objeto para o qual responsabilidades adicionais podem ser atribuídas.
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent: operation()");
    }
}
