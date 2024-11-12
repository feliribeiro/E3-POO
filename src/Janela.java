import javax.swing.*;
public class Janela extends JFrame {
    private Painel form; // Criado no editor
    public Janela() {
        super();
        form = new Painel();
        this.add(form.getPainel());
        this.setSize(800, 800);
        this.setTitle("Exemplo GUI");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}