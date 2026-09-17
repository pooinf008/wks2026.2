package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * HIERARQUIA PARALELA 2: Creator (GoF)
 * Abstração para figuras desenháveis. Declara o Factory Method (createManipulator)
 * que conecta a hierarquia de Figure com a hierarquia paralela de Manipulator.
 */
public abstract class Figure {

    public abstract Manipulator createManipulator();
    public abstract void draw();


}
