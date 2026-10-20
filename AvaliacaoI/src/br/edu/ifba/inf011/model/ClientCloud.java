package br.edu.ifba.inf011.model;

import br.edu.ifba.inf011.model.af.CloudAbstractFactory;
import br.edu.ifba.inf011.model.af.CloudAzureFactory;
import br.edu.ifba.inf011.model.builder.CloudEnvironmentBuilder;
import br.edu.ifba.inf011.model.builder.IAASScriptBuilder;
import br.edu.ifba.inf011.model.builder.InfraDirectorQ1;
import br.edu.ifba.inf011.model.builder.InfraDirectorQ2;
import br.edu.ifba.inf011.model.builder.InvoiceBuilder;

public class ClientCloud {
	
	public void runQ1() {
		
		IAASScriptBuilder iaasScriptBuilder = new IAASScriptBuilder();
		InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
		CloudEnvironmentBuilder cloudEnvBuilder = new CloudEnvironmentBuilder();
		
		
		InfraDirectorQ1 director = new InfraDirectorQ1(invoiceBuilder);
		director.constructDatabaseServer24x7();
		Invoice faturaAws = invoiceBuilder.getResult();
		System.out.println(faturaAws.gerar());

		director.setCloudBuilder(iaasScriptBuilder);
		director.constructDatabaseServer24x7();
		IAASScript iaas = iaasScriptBuilder.getResult();
		System.out.println(iaas.exportToFile());
		
		director.setCloudBuilder(cloudEnvBuilder);
		director.constructDatabaseServer24x7();
		CloudEnvironment env = cloudEnvBuilder.getResult();
		env.deploy();
		
		
	}
	
	public void runQ2() {
		
		IAASScriptBuilder iaasScriptBuilder = new IAASScriptBuilder();
		InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
		CloudEnvironmentBuilder cloudEnvBuilder = new CloudEnvironmentBuilder();

		CloudAbstractFactory caf = new CloudAzureFactory();
		
		InfraDirectorQ2 director = new InfraDirectorQ2(invoiceBuilder, caf);
		director.constructDatabaseServer24x7();
		Invoice faturaAws = invoiceBuilder.getResult();
		System.out.println(faturaAws.gerar());

		director.setCloudBuilder(iaasScriptBuilder);
		director.constructDatabaseServer24x7();
		IAASScript iaas = iaasScriptBuilder.getResult();
		System.out.println(iaas.exportToFile());
		
		director.setCloudBuilder(cloudEnvBuilder);
		director.constructDatabaseServer24x7();
		CloudEnvironment env = cloudEnvBuilder.getResult();
		env.deploy();
		
		
	}
	
	
	
	public static void main(String[] args) {
		new ClientCloud().runQ2();
	}
	

}
