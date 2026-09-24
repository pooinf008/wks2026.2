package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao2;

import java.util.Arrays;

/**
 * PARTICIPANTE: Client (GoF)
 * Demonstra a variação de implementação 2 do GoF: "Implementar a operação Clone (Deep Copy)".
 * Prova que as instâncias clonadas possuem cópias profundas dos objetos de referência
 * e das coleções internas, não compartilhando alteração de estado com os protótipos originais.
 */
public class Client {

    public void runDemo() {
        System.out.println("=== Padrão GoF: Prototype (Implementação Variação 2 - Operação Clone com Deep Copy) ===\n");

        // 1. Criando os objetos protótipos originais com referências internas
        Metadata metaOriginal = new Metadata("Autor GoF", "v1.0");
        ConcretePrototype1 proto1 = new ConcretePrototype1("Documento Base", metaOriginal);

        ConcretePrototype2 proto2 = new ConcretePrototype2(100, Arrays.asList("Java", "GoF", "DeepCopy"));

        System.out.println("--- 1. Estado dos Protótipos Originais ---");
        proto1.execute();
        proto2.execute();

        // 2. Executando a operação clone() (Deep Copy)
        System.out.println("\n--- 2. Executando Clonagem Profunda (proto1.clone()) ---");
        ConcretePrototype1 clone1 = (ConcretePrototype1) proto1.clone();

        System.out.print("[ORIGINAL] "); proto1.execute();
        System.out.print("[CLONE 1]  "); clone1.execute();

        // 3. Modificando os metadados do clone1 para comprovar o Deep Copy
        System.out.println("\n--- 3. Alterando Metadados no Clone 1 ---");
        clone1.setName("Documento Clonado e Alterado");
        clone1.getMetadata().setAuthor("Novo Autor");
        clone1.getMetadata().setVersion("v2.0");

        System.out.println("\n--- Resultado após alteração no Clone 1 ---");
        System.out.print("[ORIGINAL] "); proto1.execute();
        System.out.print("[CLONE 1]  "); clone1.execute();

        System.out.println("\n--> COMPROVAÇÃO DE DEEP COPY:");
        System.out.println("proto1.getMetadata() == clone1.getMetadata()? " 
                + (proto1.getMetadata() == clone1.getMetadata()) 
                + " (Objetos internos possuem referências de memória DISTINTAS!)");

        // 4. Teste de Deep Copy em coleções
        System.out.println("\n--- 4. Executando Clonagem Profunda em Coleção (proto2.clone()) ---");
        ConcretePrototype2 clone2 = (ConcretePrototype2) proto2.clone();
        clone2.addTag("NovaTagExclusivaDoClone");

        System.out.print("[ORIGINAL] "); proto2.execute();
        System.out.print("[CLONE 2]  "); clone2.execute();
        System.out.println("proto2.getTags() == clone2.getTags()? " 
                + (proto2.getTags() == clone2.getTags()) 
                + " (Listas internas possuem instâncias DISTINTAS!)");
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
