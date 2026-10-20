package br.edu.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.model.aws.AwsCPU;
import br.edu.ifba.inf011.model.aws.AwsMemoria;
import br.edu.ifba.inf011.model.aws.AwsStorage;
import br.edu.ifba.inf011.model.aws.AwsTabelaPrecos;
import br.edu.ifba.inf011.model.util.Elemento2IaaS;
import br.edu.ifba.inf011.model.util.Elemento2InvoiceItem;

public class ClientV01 {
	
	public IAASScript gerandoIaaS24x7() {
		
		Elemento2IaaS toIaaS = new Elemento2IaaS();
		IAASScript iaas = new IAASScript();
		
		CPU dbCpu1 = new AwsCPU(TipoCPU.MEMORY_OPTIMIZED, 3.5);
        Memoria dbRam = new AwsMemoria(64, TipoMemoria.ECC);
        Storage dbDisk1 = new AwsStorage(1024, TipoStorage.NVME, 15000);		
        //Storage dbDisk2 = new AwsStorage(4096, TipoStorage.HDD, 15000); - A atualização do dbDisk2 paga e disponível foi esquecida no CI/CD		
        
        iaas.appendResource(toIaaS.cpu2IaaS(dbCpu1));
        iaas.appendResource(toIaaS.memoria2IaaS(dbRam));
        iaas.appendResource(toIaaS.storage2IaaS(dbDisk1));
        //iaas.appendResource(toIaaS.storage2IaaS(dbDisk2));
        
		return iaas;
	}

	public Invoice gerandoInvoice24x7() {
		CPU dbCpu1 = new AwsCPU(TipoCPU.MEMORY_OPTIMIZED, 3.5);
        Memoria dbRam = new AwsMemoria(64, TipoMemoria.ECC);
        Storage dbDisk1 = new AwsStorage(1024, TipoStorage.NVME, 15000);		
        Storage dbDisk2 = new AwsStorage(4096, TipoStorage.HDD, 15000);
        
        Elemento2InvoiceItem toInvoiceItem = new Elemento2InvoiceItem(new AwsTabelaPrecos());
		Invoice fatura = new Invoice();
		
		Elemento2InvoiceItem.InvoiceItem item = toInvoiceItem.cpu2Fatura(dbCpu1); 
        fatura.adicionarItem(item.descricao(), item.precoBase());
        
        item = toInvoiceItem.memoria2Fatura(dbRam);
        fatura.adicionarItem(item.descricao(), item.precoBase());

        item = toInvoiceItem.storage2Fatura(dbDisk1);
        fatura.adicionarItem(item.descricao(), item.precoBase());
        item = toInvoiceItem.storage2Fatura(dbDisk2);
        fatura.adicionarItem(item.descricao(), item.precoBase());
        
        return fatura;		
	}	
	
	public CloudEnvironment gerandoCloudEnv24x7() {
		CPU dbCpu1 = new AwsCPU(TipoCPU.MEMORY_OPTIMIZED, 3.5);
        Memoria dbRam = new AwsMemoria(64, TipoMemoria.ECC);
        Storage dbDisk1 = new AwsStorage(1024, TipoStorage.NVME, 15000);		
        Storage dbDisk2 = new AwsStorage(4096, TipoStorage.HDD, 15000);		
		
        List<CPU> computeUnits = new ArrayList<CPU>();
		computeUnits.add(dbCpu1);
		
        List<Memoria> memoryUnits = new ArrayList<Memoria>();
        memoryUnits.add(dbRam);
        
        List<Storage> storageUnits = new ArrayList<Storage>();
        storageUnits.add(dbDisk1);
        storageUnits.add(dbDisk2);
        		
		CloudEnvironment env = new CloudEnvironment(computeUnits, memoryUnits, storageUnits);
		return env;
	}
	
	public void run() {
		System.out.println(this.gerandoIaaS24x7().exportToFile());
		System.out.println(this.gerandoInvoice24x7().gerar());
		this.gerandoCloudEnv24x7().deploy();
	}
	
	
	public static void main(String[] args) {
		new ClientV01().run();
	}	

}
