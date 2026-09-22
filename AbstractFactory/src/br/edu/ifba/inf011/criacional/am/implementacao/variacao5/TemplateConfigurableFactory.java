package br.edu.ifba.inf011.criacional.am.implementacao.variacao5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TemplateConfigurableFactory {
	
    private final Map<Class<? extends AbstractProduct>, Supplier<? extends AbstractProduct>> registry = new HashMap<>();

    public <P extends AbstractProduct> void register(Class<P> type, Supplier<P> supplier) {
        this.registry.put(type, supplier);
    }

    public <P extends AbstractProduct> P create(Class<P> type) {
        Supplier<? extends AbstractProduct> supplier = registry.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("Nenhum produto registrado para: " + type.getName());
        }
        return (P) supplier.get();
    }	

}
