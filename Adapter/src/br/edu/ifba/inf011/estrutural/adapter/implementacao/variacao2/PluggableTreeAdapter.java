package br.edu.ifba.inf011.estrutural.adapter.implementacao.variacao2;

import java.util.List;
import java.util.function.Function;

public class PluggableTreeAdapter<T> implements TreeDisplayNode {
    private final T targetObject;
    private final Function<T, String> labelExtractor;       
    private final Function<T, List<T>> childrenExtractor;  // Bloco para extrair os filhos

    public PluggableTreeAdapter(T targetObject,
                                Function<T, String> labelExtractor, 
                                Function<T, List<T>> childrenExtractor) {
        this.targetObject = targetObject;
        this.labelExtractor = labelExtractor;
        this.childrenExtractor = childrenExtractor;
    }

    @Override
    public String getLabel() {
        return labelExtractor.apply(targetObject);
    }

    @Override
    public List<TreeDisplayNode> getChildren() {
        List<T> children = childrenExtractor.apply(targetObject);
        return children.stream()
                .map(child -> new PluggableTreeAdapter<>(child, labelExtractor, childrenExtractor))
                .map(TreeDisplayNode.class::cast)
                .toList();
    }
}
