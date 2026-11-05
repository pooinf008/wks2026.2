package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: Implementor (GoF)
 * Define a interface para as classes de implementação.
 * Esta interface não precisa corresponder diretamente à interface de Abstraction;
 * de fato, as duas interfaces podem ser bem distintas.
 * 
 * Tipicamente, a interface Implementor fornece apenas operações primitivas,
 * enquanto Abstraction define operações de nível mais alto baseadas nessas primitivas.
 */
public interface Implementor {

    public void operationImp();
}
