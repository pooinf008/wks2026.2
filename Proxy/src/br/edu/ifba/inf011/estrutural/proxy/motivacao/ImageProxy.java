package br.edu.ifba.inf011.estrutural.proxy.motivacao;

/**
 * PARTICIPANTE: Proxy (GoF)
 * Substituto (placeholder) da imagem real. Armazena o nome do arquivo
 * (fileName) como referência e uma cópia de extent. Só cria a Image
 * quando o editor solicita que ela seja exibida (draw()).
 * getExtent() responde sem instanciar a imagem enquanto ela não for carregada.
 */
public class ImageProxy implements Graphic {

    private Image image;
    private Extent extent;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        this.extent = null;
        this.image = null;
    }

    protected Image getImage() {
        if (image == null) {
            image = new Image(fileName);
        }
        return image;
    }

    @Override
    public void draw() {
        getImage().draw();
    }

    @Override
    public Extent getExtent() {
        if (image == null) {
            if (extent == null) {
                extent = new Extent(800, 600); // lido do cabeçalho do arquivo, sem carregar a imagem
            }
            System.out.println("ImageProxy: retornando extent armazenado " + extent + " sem carregar a imagem");
            return extent;
        }
        return image.getExtent();
    }

    @Override
    public void store(String out) {
        System.out.println("ImageProxy: armazenando referência (" + fileName + ", " + extent + ") em " + out);
    }

    @Override
    public void load(String in) {
        System.out.println("ImageProxy: carregando referência de " + in);
        this.fileName = in;
    }
}
