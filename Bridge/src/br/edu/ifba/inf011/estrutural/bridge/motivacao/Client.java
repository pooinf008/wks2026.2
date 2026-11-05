package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: Client (GoF - Motivação)
 * 
 * Demonstra como a abstração (hierarquia de Window) e a implementação
 * (hierarquia de WindowImp) podem variar independentemente, evitando a
 * explosão combinatória de subclasses (ex: XIconWindow, PMIconWindow, XTransientWindow, PMTransientWindow).
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Bridge (Motivação - Window e WindowImp) ===\n");

        WindowImp xWindowImp = new XWindowImp();
        WindowImp pmWindowImp = new PMWindowImp();

        System.out.println("-- 1. IconWindow sobre X Window (X11):");
        IconWindow iconWindowX = new IconWindow(xWindowImp);
        iconWindowX.drawBorder();

        System.out.println("\n-- 2. IconWindow sobre Presentation Manager (PM):");
        IconWindow iconWindowPM = new IconWindow(pmWindowImp);
        iconWindowPM.drawBorder();

        System.out.println("\n-- 3. TransientWindow sobre X Window (X11):");
        TransientWindow dialogX = new TransientWindow(xWindowImp);
        dialogX.drawRect(10, 10, 200, 100);
        dialogX.drawText("Mensagem de Diálogo", 20, 30);
        dialogX.drawCloseBox();

        System.out.println("\n-- 4. TransientWindow sobre Presentation Manager (PM):");
        TransientWindow dialogPM = new TransientWindow(pmWindowImp);
        dialogPM.drawRect(10, 10, 200, 100);
        dialogPM.drawText("Mensagem de Diálogo", 20, 30);
        dialogPM.drawCloseBox();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
