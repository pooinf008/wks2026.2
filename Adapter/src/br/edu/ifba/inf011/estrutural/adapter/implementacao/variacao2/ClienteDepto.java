package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2;

import br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2.depto.Departamento;

public class ClienteDepto extends Client{
	
	public void run(){
        Departamento diretoriaExecutiva = new Departamento("Diretoria Executiva");
        
        Departamento ti = new Departamento("Tecnologia da Informação");
        Departamento rh = new Departamento("Recursos Humanos");
        Departamento financeiro = new Departamento("Financeiro");

        ti.adicionarSubDepartamento(new Departamento("Engenharia de Software"));
        ti.adicionarSubDepartamento(new Departamento("Infraestrutura & Cloud"));
        ti.adicionarSubDepartamento(new Departamento("Cibersegurança"));

        rh.adicionarSubDepartamento(new Departamento("Recrutamento & Seleção"));
        rh.adicionarSubDepartamento(new Departamento("Treinamento & Desenvolvimento"));

        diretoriaExecutiva.adicionarSubDepartamento(ti);
        diretoriaExecutiva.adicionarSubDepartamento(rh);
        diretoriaExecutiva.adicionarSubDepartamento(financeiro);
        
        TreeDisplayNode organogramaAdapter = new PluggableTreeAdapter<Departamento>(
                diretoriaExecutiva,
                Departamento::getNomeSetor,       
                Departamento::getSubDepartamentos 
            );
        
        this.printTree(organogramaAdapter, "🏢 ", "");
	}
	
    public static void main(String[] args) {
		new ClienteDepto().run();
	}	
		

}
