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
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    cd.addDrone(new DronePessoas(Integer.parseInt(String.valueOf(textField1)),
                            Double.parseDouble(String.valueOf(textField2)),
                            Double.parseDouble(String.valueOf(textField3)),
                            Integer.parseInt(String.valueOf(textField4))));
                    textArea1.setText(textField1 +"/n"+textField2+"/n"+textField3+"/n"+textField4);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());//"Erro ao adicionar drone de pessoas");
                }
            }
        });
    }

    public JPanel getPainel() {
        return painel;
    }
}
