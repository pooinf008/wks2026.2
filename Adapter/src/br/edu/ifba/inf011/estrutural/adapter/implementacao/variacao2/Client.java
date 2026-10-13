package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2;

public abstract class Client {
	
    protected void printTree(TreeDisplayNode node, String icon, String recuo) {
        System.out.println(recuo + icon + node.getLabel());
        for (TreeDisplayNode child : node.getChildren()) {
            this.printTree(child, icon, recuo + "   ");
        }
    }		

}
