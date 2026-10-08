package br.edu.ifba.inf011.criacional.singleton.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Padrão GoF: Singleton (Motivação) - PrinterSpooler
 * 
 * Cenário GoF (Capítulo 3 - Singleton):
 * Em um sistema operacional ou corporativo, deve haver exatamente UMA ÚNICA instância
 * do spooler de impressão para gerenciar a fila global de documentos e evitar conflitos
 * de acesso ao hardware de impressão.
 * 
 * A própria classe é responsável por:
 * 1. Garantir que apenas uma instância seja criada (construtor privado).
 * 2. Fornecer um ponto global de acesso à instância única via getInstance().
 */
public class PrinterSpooler {

    private static PrinterSpooler instance;
    private final List<PrintJob> printQueue = new ArrayList<>();

    private PrinterSpooler() {
    }

    // Ponto de acesso global estático à instância única (Singleton)
    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    /**
     * Adiciona um trabalho de impressão à fila única do Spooler.
     */
    public synchronized void addJob(PrintJob job) {
        printQueue.add(job);
        System.out.println("[PrinterSpooler]: Trabalho adicionado -> " + job);
    }

    /**
     * Processa e imprime os trabalhos presentes na fila.
     */
    public synchronized void processQueue() {
        System.out.println("\n[PrinterSpooler]: Processando fila de impressão (" + printQueue.size() + " trabalhos)...");
        for (PrintJob job : printQueue)
            System.out.println("  -> Imprimindo: " + job.getDocumentName() + " (" + job.getPageCount() + " páginas)");
        printQueue.clear();
        System.out.println("[PrinterSpooler]: Fila concluída com sucesso.\n");
    }


}
