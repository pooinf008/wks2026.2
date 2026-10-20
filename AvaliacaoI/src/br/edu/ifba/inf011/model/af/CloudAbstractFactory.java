package br.edu.ifba.inf011.model.af;

import br.edu.ifba.inf011.model.CPU;
import br.edu.ifba.inf011.model.Memoria;
import br.edu.ifba.inf011.model.Storage;
import br.edu.ifba.inf011.model.TabelaPrecos;
import br.edu.ifba.inf011.model.TipoCPU;
import br.edu.ifba.inf011.model.TipoMemoria;
import br.edu.ifba.inf011.model.TipoStorage;

public interface CloudAbstractFactory {
	
	public CPU getCPU(TipoCPU tipo, double clockSpeed);
	public Memoria getMemoria(int ramGb, TipoMemoria tipo);
	public Storage getStorage(int capacity, TipoStorage tipo, int iops);
	public TabelaPrecos getTabelaPrecos();
	

}
