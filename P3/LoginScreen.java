package P3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> languageDropdown;
    private String username,password;  
    private Arq arq = new Arq();    
    private Login login = new Login();

    public LoginScreen() {
        arq.read("P3", "test.txt");
        setTitle("Tela de Login");
        setSize(400, 250); // Defina o tamanho da janela
        setResizable(false); // Desativar a redimensionamento
        setLocationRelativeTo(null); // Centralizar a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Use GridBagLayout para melhor controle

        // Rótulos e campos de texto
        JLabel usernameLabel = new JLabel("Usuário:");
        usernameField = new JTextField(20); // Defina o tamanho do campo
        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField(20); // Defina o tamanho do campo

        // Dropdown para seleção de idioma
        JLabel languageLabel = new JLabel("Idioma:");
        String[] languages = {"Inglês", "Espanhol", "Português"};
        languageDropdown = new JComboBox<>(languages);

        // Botão de login
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coloque o código de validação de login aqui
                username = usernameField.getText();
                password = String.format("%s", new String(passwordField.getPassword()));
                System.out.println(password);
                if (login.validate(username, password, arq.getMsgList())) {
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login Feito com sucesso");
                    System.exit(0);
                } else if (login.getControl() == 1) {
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Senha Invalida");
                    setVisible(true);
                } else if (login.getControl() == -1) {
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Usuario Invalido");
                    setVisible(true);
                }
                
                String selectedLanguage = (String) languageDropdown.getSelectedItem();
            }
        });

        // Botão de cadastrar
        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               SingIn singIn = new SingIn();
               setVisible(false);
               singIn.setVisible(true);
            }
        });

        // Configuração das posições dos componentes no painel usando GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        c.gridx = 0;
        c.gridy = 0;
        panel.add(usernameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(usernameField, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(passwordLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(passwordField, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(languageLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        panel.add(languageDropdown, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2; // Span duas colunas
        panel.add(loginButton, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2; // Span duas colunas
        panel.add(cadastrarButton, c);

        add(panel);
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    
}