package br.edu.ifba.inf011.criacional.am.implementacao.variacao4;

import java.util.function.Supplier;

public class TemplateGenericFactory<A extends AbstractProductA, B extends AbstractProductB> implements AbstractFactory{
	
    private final Supplier<A> aSupplier;
    private final Supplier<B> bSupplier;
    
    public TemplateGenericFactory(Supplier<A> aSupplier, Supplier<B> bSupplier) {
        this.aSupplier = aSupplier;
        this.bSupplier = bSupplier;
    }

	@Override
	public AbstractProductA createProductA() {
		return this.aSupplier.get();
	}

	@Override
	public AbstractProductB createProductB() {
		return this.bSupplier.get();
	}
    
    
    

}
