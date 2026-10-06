package br.edu.ifba.inf011.criacional.builder.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de demonstração da Motivação do Padrão Builder (GoF).
 * 
 * Cenário do Livro GoF (Padrões de Projetos):
 * Leitor de Documentos RTF (RTFReader).
 * 
 * O RTFReader atua como Diretor (Director), analisando os tokens de um documento RTF
 * (caracteres, mudanças de fonte e quebras de parágrafo) e delegando a construção das partes
 * para uma subclasse de TextConverter (Builder Abstrato).
 * 
 * Este exemplo demonstra como reutilizar o algoritmo de parsing do RTFReader
 * configurando-o com 3 conversores distintos:
 * 1. ASCIIConverter -> produz um ASCIIText (texto puro sem formatação)
 * 2. TeXConverter -> produz um TeXText (código de marcação TeX)
 * 3. TextWidgetConverter -> produz um TextWidget (componente gráfico interativo de UI)
 */
public class App {
	
    private List<RTFToken> parseDocument() {
        List<RTFToken> tokens = new ArrayList<>();

        // Parágrafo 1: Fonte Helvetica 12pt -> "Olá " + Fonte TimesBold 14pt -> "Mundo!" + Parágrafo
        tokens.add(new RTFToken(new Font("Helvetica", 12, false)));
        for (char c : "Olá ".toCharArray())
            tokens.add(new RTFToken(c));

        tokens.add(new RTFToken(new Font("Times", 14, true)));
        for (char c : "Mundo!".toCharArray())
            tokens.add(new RTFToken(c));

        tokens.add(new RTFToken(TokenType.PARAGRAPH));

        // Parágrafo 2: Fonte Courier 10pt -> "Exemplo do padrão Builder (GoF)." + Parágrafo
        tokens.add(new RTFToken(new Font("Courier", 10, false)));
        for (char c : "Exemplo do padrão Builder (GoF).".toCharArray())
            tokens.add(new RTFToken(c));

        tokens.add(new RTFToken(TokenType.PARAGRAPH));

        return tokens;
    }	
    
    
    public void run() {
    	List<RTFToken> rtfDocument = this.parseDocument();
    	 RTFReader reader = new RTFReader(null);

    	System.out.println("=======Conversão de RTF para Texto ASCII=======");
        ASCIIConverter asciiBuilder = new ASCIIConverter();
        reader.setConverter(asciiBuilder);
        reader.parseRTF(rtfDocument);
        ASCIIText asciiText = asciiBuilder.getASCIIText();
        System.out.println("Resultado (ASCIIText):\n" + asciiText.getContent() + "\n");

        System.out.println("=======Conversão de RTF para Formato TeX=======");
        TeXConverter texBuilder = new TeXConverter();
        reader.setConverter(texBuilder);
        reader.parseRTF(rtfDocument);
        TeXText texText = texBuilder.getTeXText();
        System.out.println("Resultado (TeXText):\n" + texText.getTexCode() + "\n");
       
        
        System.out.println("=======Conversão de RTF para Componente TextWidget UI=======");
        TextWidgetConverter widgetBuilder = new TextWidgetConverter();
        reader.setConverter(widgetBuilder);
        reader.parseRTF(rtfDocument);
        TextWidget textWidget = widgetBuilder.getTextWidget();
        System.out.println("Resultado (TextWidget UI):\n" + textWidget.renderUI() + "\n");        
        
        
    }
	

    public static void main(String[] args) {
		new App().run();
	}
    

}
