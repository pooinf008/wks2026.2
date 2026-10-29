package br.edu.ifba.inf011.estrutural.proxy.estrutura;

/**
 * PARTICIPANTE: Proxy (GoF)
 * Mantém uma referência (realSubject) que permite acessar o objeto real,
 * fornece interface idêntica à de Subject e controla o acesso ao objeto
 * real, podendo ser responsável por criá-lo e excluí-lo.
 * request() repassa a solicitação ao RealSubject: realSubject.request().
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            System.out.println("Proxy: criando RealSubject sob demanda");
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: repassando request() ao RealSubject");
        realSubject.request();
    }
}
