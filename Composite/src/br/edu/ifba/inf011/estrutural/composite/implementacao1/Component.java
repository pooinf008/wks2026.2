package br.edu.ifba.inf011.estrutural.composite.implementacao1;

/**
 * PARTICIPANTE: Component (GoF - Seção Implementação, Item 4)
 * 
 * Aborda a decisão entre Segurança (Safety) e Transparência (Transparency) na declaração
 * das operações de gerenciamento de filhos.
 * 
 * Nesta abordagem segura, as operações add(), remove() e getChild() NÃO são declaradas
 * em Component, evitando que sejam chamadas indevidamente sobre nós-folha (Leaf).
 * 
 * Para permitir que clientes consultem se um componente é um Composite sem recorrer
 * a downcasting (instanceof), declara a operação getComposite(), que por padrão retorna null.
 */
public interface Component {

    public void operation();

    public default Composite getComposite() {
        return null;
    }
}
