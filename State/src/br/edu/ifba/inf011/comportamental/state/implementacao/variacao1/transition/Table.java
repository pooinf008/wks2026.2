package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.transition;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPConnection;
import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPInput;
import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPState;
import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TransitionAction;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Conforme o GoF:
 * "No livro Applicative Programming with C++ [BP94], Blandy e Pressman mostram como
 * usar tabelas para mapear entradas para transições de estados. Para cada estado, uma
 * tabela mapeia cada entrada possível para um estado seguinte. Essencialmente, esta
 * abordagem converte declarações condicionais (tais como switch ou if-then-else) em uma
 * consulta a uma tabela."
 * 
 * Vantagem principal:
 * - Regularidade: mudança nos critérios de transição apenas modificando os dados da tabela,
 *   sem necessidade de recompilar ou alterar o código das classes.
 * 
 * Desvantagens:
 * - Consulta à tabela pode ser ligeiramente menos rápida do que chamadas diretas a métodos.
 * - Torna a transição de estados menos explícita no código das classes.
 * - Dificuldade para executar ações arbitrárias durante a transição (resolvido aqui via TransitionAction).
 */
public class Table {

    private final Map<Key, Entry> table = new HashMap<>();

    public void addTransition(TCPState currentState, TCPInput input, TCPState nextState) {
        addTransition(currentState, input, nextState, null);
    }

    public void addTransition(TCPState currentState, TCPInput input, TCPState nextState, TransitionAction action) {
        this.table.put(new Key(currentState, input), new Entry(nextState, action));
    }

    public void removeTransition(TCPState currentState, TCPInput input) {
        this.table.remove(new Key(currentState, input));
    }

    public boolean execute(TCPConnection connection, TCPInput input) {
        TCPState current = connection.getState();
        Key key = new Key(current, input);
        Entry entry = this.table.get(key);
        
        if (entry == null) {
            System.out.println("[Tabela] Entrada '" + input + "' não definida para o estado corrente: " + current.getName());
            return false;
        }
        
        TCPState next = entry.nextState();
        
        System.out.println("[Tabela] Consulta: " + key + " ==> Próximo Estado: [" + next.getName() + "]");
        if (entry.action() != null)
            entry.action().execute(connection, input);
        connection.setState(next);
        return true;
    }



}
