package br.edu.ifba.inf011.model.af;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;
import br.edu.ifba.inf011.model.TipoStorage;
import br.edu.ifba.inf011.model.aws.AwsCPU;
import br.edu.ifba.inf011.model.aws.AwsMemoria;
import br.edu.ifba.inf011.model.aws.AwsStorage;
import br.edu.ifba.inf011.model.aws.AwsTabelaPrecos;

public class CloudAwsFactory implements CloudAbstractFactory{

	@Override
	public CPU getCPU(TipoCPU tipo, double clockSpeed) {
		return new AwsCPU(tipo, clockSpeed);
	}

	@Override
	public Memoria getMemoria(int ramGb, TipoMemoria tipo) {
		return new AwsMemoria(ramGb, tipo);
	}

	@Override
	public Storage getStorage(int capacity, TipoStorage tipo, int iops) {
		return new AwsStorage(capacity, tipo, iops);
	}

	@Override
	public TabelaPrecos getTabelaPrecos() {
		return new AwsTabelaPrecos();
	}

}
