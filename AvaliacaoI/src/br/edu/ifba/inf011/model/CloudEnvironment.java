package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

public class CloudEnvironment {
    private List<CPU> computeUnits = new ArrayList<CPU>();
    private List<Memoria> memoryUnits = new ArrayList<Memoria>();
    private List<Storage> storageUnits = new ArrayList<Storage>();
    
    public CloudEnvironment(List<CPU> computeUnits, List<Memoria> memoryUnits, List<Storage> storageUnits) {
		super();
		this.computeUnits = computeUnits;
		this.memoryUnits = memoryUnits;
		this.storageUnits = storageUnits;
	}


	// Exibição estruturada do ambiente final
    public void deploy() {
        System.out.println("\n=== DEPLOY DO AMBIENTE CLOUD CONCLUÍDO ===");
        System.out.println("Processamento : " + (computeUnits.isEmpty() ? "Nenhum" : computeUnits));
        System.out.println("Memória       : " + (memoryUnits.isEmpty() ? "Nenhuma" : memoryUnits));
        System.out.println("Armazenamento : " + (storageUnits.isEmpty() ? "Nenhum" : storageUnits));
        System.out.println("==========================================");
    }
}