package br.edu.ifba.inf011.criacional.fm.implementacao.variacao4;

import java.util.function.Supplier;

/**
 * PARTICIPANTE: StandardCreator / Creator Genérico (GoF - Implementação: Uso de Templates/Generics)
 *
 * Em C++, o livro GoF sugere o uso de Templates (`StandardCreator<TheProduct>`) para evitar
 * a proliferação de subclasses de Creator. Em Java moderno, esse conceito é implementado com Generics
 * (`FabricaGenerica<T>`) e a interface funcional `Supplier<T>` (referência a construtores).
 */
public class FabricaGenerica<T extends Documento> {

    private final Supplier<T> construtor;

    public FabricaGenerica(Supplier<T> construtor) {
        this.construtor = construtor;
    }

    /**
     * FACTORY METHOD GENÉRICO
     * Instancia o produto utilizando o Supplier fornecido no construtor.
     */
    public T fabricar() {
        System.out.println("\nFabricaGenerica: Executando validações e registros de auditoria...");
        return this.construtor.get();
    }
}
