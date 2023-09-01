import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela extends JFrame {
    public MinhaJanela() {
        super("Testando minha janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setLocationRelativeTo(null);

        JTextField campoTexto = new JTextField(20);

        JButton botao = new JButton("Confirma");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String textoDigitado = campoTexto.getText();
                JOptionPane.showMessageDialog(null, "Bem vindo " + textoDigitado);
            }
        });
        

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        painel.add(new JLabel("Digite seu nome: "));
        painel.add(campoTexto);
        painel.add(botao);
        

        getContentPane().add(painel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MinhaJanela janela = new MinhaJanela();
            janela.setVisible(true);
        });
    }
}
