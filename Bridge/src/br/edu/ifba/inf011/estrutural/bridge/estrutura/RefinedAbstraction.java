package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: RefinedAbstraction (GoF)
 * Estende a interface definida por Abstraction, podendo especializar a operação existente
 * ou adicionar novas operações de alto nível.
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void operation() {
        System.out.print("RefinedAbstraction (refinada) -> ");
        super.operation();
    }

    public void otherOperation() {
        System.out.print("RefinedAbstraction (outra operação) -> ");
        imp.operationImp();
    }
}
