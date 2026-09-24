package br.edu.ifba.inf011.criacional.prototype.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Canva Virtual onde as pautas e notas musicais são adicionadas.
 * Permite a impressão da música através do método printScore(),
 * retornando uma String com todos os novos objetos clonados no canva.
 */
public class Canvas {

    private final List<Graphic> elements = new ArrayList<>();

    public void add(Graphic graphic) {
        if (graphic != null) {
            this.elements.add(graphic);
        }
    }

    public List<Graphic> getElements() {
        return elements;
    }

    /**
     * Retorna a partitura formatada em String com todos os objetos criados/clonados no Canva.
     */
    public String printScore() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================================\n");
        sb.append("            CANVA VIRTUAL - PARTITURA MUSICAL      \n");
        sb.append("===================================================\n");
        sb.append("Total de elementos criados e desenhados: ").append(elements.size()).append("\n\n");

        for (int i = 0; i < elements.size(); i++) {
            Graphic g = elements.get(i);
            sb.append(String.format("[%02d] %s (Objeto #%h)\n", 
                    i + 1, g.draw(), g));
        }
        sb.append("===================================================");
        return sb.toString();
    }
}
