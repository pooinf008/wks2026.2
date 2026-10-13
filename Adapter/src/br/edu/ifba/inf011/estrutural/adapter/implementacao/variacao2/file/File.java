package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2.file;

import java.util.ArrayList;
import java.util.List;

public class File {
    private final String name;
    private final boolean isDirectory;
    private final List<File> children;

    public File(String name) {
        this(name, false);
    }

    public File(String name, boolean isDirectory) {
        this.name = name;
        this.isDirectory = isDirectory;
        this.children = new ArrayList<>();
    }

    public void addFile(File child) {
        if (!this.isDirectory) {
            throw new IllegalStateException("Não é possível adicionar subitens a um arquivo comum.");
        }
        this.children.add(child);
    }

    public String getName() {
        return this.name;
    }

    public File[] listFiles() {
        if (!isDirectory || children.isEmpty())
            return new File[0];
        return children.toArray(new File[0]);
    }

    public boolean isDirectory() {
        return this.isDirectory;
    }	

}
