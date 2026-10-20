package br.edu.ifba.inf011.model.builder;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;
import br.edu.ifba.inf011.model.TipoStorage;
import br.edu.ifba.inf011.model.aws.AwsCPU;
import br.edu.ifba.inf011.model.aws.AwsMemoria;
import br.edu.ifba.inf011.model.aws.AwsStorage;
import br.edu.ifba.inf011.model.aws.AwsTabelaPrecos;

public class InfraDirectorQ1 {
	
	
	private CloudBuilder builder;
	
	
	public InfraDirectorQ1(CloudBuilder builder) {
		this.setCloudBuilder(builder);
	}
	
	public void setCloudBuilder(CloudBuilder builder) {
		this.builder = builder;
	}

	public void constructDatabaseServer24x7() {
        builder.reset();
        CPU dbCpu = new AwsCPU(TipoCPU.MEMORY_OPTIMIZED, 3.5);
        Memoria dbRam = new AwsMemoria(64, TipoMemoria.ECC);
        Storage dbDisk = new AwsStorage(1024, TipoStorage.NVME, 15000);
        builder.withTabelaPrecos(new AwsTabelaPrecos());
        builder.addCPU(dbCpu);
        builder.addMemoria(dbRam);
        builder.addStorage(dbDisk);
    }
	

}
