package br.edu.ifba.inf011.criacional.singleton.motivacao;

/**
 * Classe principal para demonstração da Motivação do Padrão Singleton (GoF).
 * 
 * Cenário do Livro GoF:
 * Spooler de Impressão (PrinterSpooler).
 * 
 * Demonstra que múltiplos componentes ou partes da aplicação acessam exatamente
 * a mesma instância do PrinterSpooler, garantindo a integridade da fila de impressão.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=== Padrão GoF: Singleton (Motivação - PrinterSpooler) ===\n");

        // 1. O Cliente A solicita o Spooler de Impressão
        System.out.println("--- 1. Cliente A obtendo referência do Spooler ---");
        PrinterSpooler spoolerA = PrinterSpooler.getInstance();
        spoolerA.addJob(new PrintJob("JOB-001", "Relatório_Financeiro.pdf", 15));
        spoolerA.addJob(new PrintJob("JOB-002", "Contrato_Servico.docx", 5));

        // 2. O Cliente B solicita o Spooler de Impressão em outra parte do sistema
        System.out.println("\n--- 2. Cliente B obtendo referência do Spooler ---");
        PrinterSpooler spoolerB = PrinterSpooler.getInstance();
        spoolerB.addJob(new PrintJob("JOB-003", "Diagrama_Arquitetura.png", 2));

        // 3. Verificação de identidade de objeto (Identity Check)
        System.out.println("\n--- 3. Verificação da Identidade da Instância ---");
        System.out.println("spoolerA == spoolerB? " + (spoolerA == spoolerB) + " (Instância Única!)");
        System.out.println("Código Hash Spooler A: " + System.identityHashCode(spoolerA));
        System.out.println("Código Hash Spooler B: " + System.identityHashCode(spoolerB));

        // 4. Processamento da fila compartilhada pelo Spooler único
        System.out.println("\n--- 4. Processando a Fila de Impressão Centralizada ---");
        spoolerA.processQueue();
    }
}
