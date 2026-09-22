package br.edu.ifba.inf011.criacional.am.implementacao.variacao6;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class TemplateReflectionFactory {
	
	private final Map<String, String> registry;
    
    public TemplateReflectionFactory() {
    	this.registry = new HashMap<String, String>();
    }

	public void register(String key, String fullClassName) {
        this.registry.put(key, fullClassName);
    }

	public AbstractProduct create(String key) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		String className = registry.get(key);
        if (className == null)
            throw new IllegalArgumentException("Nenhuma classe registrada para a chave: " + key);
        
        Class<?> classe = Class.forName(className);
        if (!AbstractProduct.class.isAssignableFrom(classe))
            throw new IllegalArgumentException("A classe " + className + " não herda de AbstractProduct");
        return (AbstractProduct) classe.getDeclaredConstructor().newInstance();
	}
    
    
    

}
