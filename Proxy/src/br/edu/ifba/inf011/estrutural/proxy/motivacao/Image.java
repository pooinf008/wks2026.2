package br.edu.ifba.inf011.estrutural.proxy.motivacao;

/**
 * PARTICIPANTE: RealSubject (GoF)
 * Imagem rasterizada grande, cuja criação (carga do arquivo) é cara.
 * Mantém imageImp (os dados da imagem) e extent (suas dimensões).
 */
public class Image implements Graphic {

    private byte[] imageImp;
    private Extent extent;

    public Image(String fileName) {
        load(fileName);
    }

    @Override
    public void draw() {
        System.out.println("Image: desenhando imagem (" + imageImp.length + " bytes) de tamanho " + extent);
    }

    @Override
    public Extent getExtent() {
        return extent;
    }

    @Override
    public void store(String out) {
        System.out.println("Image: armazenando imagem em " + out);
    }

    @Override
    public void load(String in) {
        System.out.println("Image: carregando (operação cara) o arquivo " + in + "...");
        this.imageImp = new byte[1024 * 1024];
        this.extent = new Extent(800, 600);
    }
}
