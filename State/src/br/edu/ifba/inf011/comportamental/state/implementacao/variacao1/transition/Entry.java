package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.transition;

import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPState;
import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TransitionAction;

public record Entry (TCPState nextState, TransitionAction action){

}