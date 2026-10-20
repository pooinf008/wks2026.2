package br.edu.ifba.inf011.model.af;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;
import br.edu.ifba.inf011.model.TipoStorage;
import br.edu.ifba.inf011.model.azure.AzureCPU;
import br.edu.ifba.inf011.model.azure.AzureMemoria;
import br.edu.ifba.inf011.model.azure.AzureStorage;
import br.edu.ifba.inf011.model.azure.AzureTabelaPrecos;

public class CloudAzureFactory implements CloudAbstractFactory{

	@Override
	public CPU getCPU(TipoCPU tipo, double clockSpeed) {
		return new AzureCPU(tipo, clockSpeed);
	}

	@Override
	public Memoria getMemoria(int ramGb, TipoMemoria tipo) {
		return new AzureMemoria(ramGb, tipo);
	}

	@Override
	public Storage getStorage(int capacity, TipoStorage tipo, int iops) {
		return new AzureStorage(capacity, tipo, iops);
	}

	@Override
	public TabelaPrecos getTabelaPrecos() {
		return new AzureTabelaPrecos();
	}

}