package br.edu.ifba.inf011.model.builder;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;
import br.edu.ifba.inf011.model.TipoStorage;
import br.edu.ifba.inf011.model.af.CloudAbstractFactory;

public class InfraDirectorQ2 {
	
	
	private CloudBuilder builder;
	private CloudAbstractFactory af; 
	
	
	public InfraDirectorQ2(CloudBuilder builder, CloudAbstractFactory af) {
		this.setCloudBuilder(builder);
		this.setCloudAbstractFactory(af);
	}
	
	public void setCloudBuilder(CloudBuilder builder) {
		this.builder = builder;
	}
	
	public void setCloudAbstractFactory(CloudAbstractFactory af) {
		this.af = af;
	}
	

	public void constructDatabaseServer24x7() {
        builder.reset();
        CPU dbCpu = this.af.getCPU(TipoCPU.MEMORY_OPTIMIZED, 3.5);
        Memoria dbRam = this.af.getMemoria(64, TipoMemoria.ECC);
        Storage dbDisk = this.af.getStorage(1024, TipoStorage.NVME, 15000);
        builder.withTabelaPrecos(this.af.getTabelaPrecos());
        builder.addCPU(dbCpu);
        builder.addMemoria(dbRam);
        builder.addStorage(dbDisk);
    }
	

}
