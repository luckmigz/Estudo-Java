package P3;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class SingIn extends JFrame {
    private JTextField novoUsernameField;
    private JPasswordField novoPasswordField;
    private JPasswordField confirmarPasswordField;

    public SingIn() {
        setTitle("Tela de Cadastro");
        setSize(400, 250); // Defina o tamanho da janela
        setResizable(false); // Desativar a redimensionamento
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Use GridBagLayout para melhor controle

        // Rótulos e campos de texto para o cadastro
        JLabel novoUsernameLabel = new JLabel("Novo Usuário:");
        novoUsernameField = new JTextField(20); // Defina o tamanho do campo
        JLabel novoPasswordLabel = new JLabel("Nova Senha:");
        novoPasswordField = new JPasswordField(20); // Defina o tamanho do campo
        JLabel confirmarPasswordLabel = new JLabel("Confirmar Senha:");
        confirmarPasswordField = new JPasswordField(20); // Defina o tamanho do campo

        // Botão de cadastrar
        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novoUsername = novoUsernameField.getText();
                String novaSenha = String.format("%s", new String(novoPasswordField.getPassword()));
                String confirmarSenha = String.format("%s", new String(confirmarPasswordField.getPassword()));

                if (novaSenha.equals(confirmarSenha)) {
                    Arq arq = new Arq();
                    arq.write(String.format("%s : %s", novoUsername, novaSenha),new File("P3", "test.txt"));
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    setVisible(false);
                    LoginScreen login = new LoginScreen();
                    login.setVisible(true);
                    arq.close();
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem. Tente novamente.");
                }
            }
        });

        // Configuração das posições dos componentes no painel usando GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        c.gridx = 0;
        c.gridy = 0;
        panel.add(novoUsernameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(novoUsernameField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(novoPasswordLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(novoPasswordField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(confirmarPasswordLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        panel.add(confirmarPasswordField, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2; // Span duas colunas
        panel.add(cadastrarButton, c);

        add(panel);
    }
}
