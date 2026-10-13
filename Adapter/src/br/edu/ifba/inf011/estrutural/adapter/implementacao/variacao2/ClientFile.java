package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2;

import java.util.List;

import br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2.file.File;

public class ClientFile extends Client{
	
	
	public void run(){
        // 1. Montamos uma estrutura de pastas usando a nossa classe File
        File minhaPasta = new File("Documentos_Projeto", true);
        File subPastaSrc = new File("src", true);
        File arquivo1 = new File("Main.java");
        File arquivo2 = new File("README.md");

        subPastaSrc.addFile(arquivo1);
        minhaPasta.addFile(subPastaSrc);
        minhaPasta.addFile(arquivo2);
        
        TreeDisplayNode fileAdapter = new PluggableTreeAdapter<File>(
                minhaPasta, 
                File::getName, 
                file -> List.of(file.listFiles())
            );  
        
        this.printTree(fileAdapter, "📁 ", "");
	}
    
    public static void main(String[] args) {
		new ClientFile().run();
	}
	

}
