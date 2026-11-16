package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.transition;

import java.util.Objects;

import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPInput;
import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.TCPState;

public class Key {
    private final String stateName;
    private final TCPInput input;

    public Key(TCPState state, TCPInput input) {
        this.stateName = state != null ? state.getName() : "";
        this.input = input;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key that = (Key) o;
        return Objects.equals(stateName, that.stateName) && input == that.input;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName, input);
    }

    @Override
    public String toString() {
        return "(" + stateName + ", " + input + ")";
    }
}
