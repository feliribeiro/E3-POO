import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel painel;
    private JTextField textField4;
    private JButton okButton;
    private JButton limparButton;
    private JButton fecharButton;
    private JTextArea textArea1;

    public Painel() {
        CadastroDrone cd = new CadastroDrone();
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpaTudo();
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int codigo = Integer.parseInt(textField1.getText());
                    double custoFixo = Double.parseDouble(textField2.getText());
                    double autonomia = Double.parseDouble(textField3.getText());
                    int qtdMaxima = Integer.parseInt(textField4.getText());
                    cd.addDrone(new DronePessoas(codigo, custoFixo, autonomia, qtdMaxima));

                    textArea1.setText(
                    "Código do Drone: " + textField1.getText() + "\n" +
                            "Custo Fixo: " + textField2.getText() + "\n" +
                            "Autonomia: " + textField3.getText() + "\n" +
                            "Quantidade Máxima de Pessoas: " + textField4.getText()
                    );
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro de formatação: Digite números válidos.");
                    limpaTudo();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar drone: " + ex.getMessage());
                    limpaTudo();
                }
            }
        });
    }
    public void limpaTudo(){
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textArea1.setText("");
    }
    public JPanel getPainel() {
        return painel;
    }
}
