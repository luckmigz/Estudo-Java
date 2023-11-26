package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ViewUi extends JFrame {
    private JTextField msgField;
    private JLabel status;
    private String err; 
  

    public ViewUi() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        msgField = new JTextField();
        panel.add(msgField);

        status = new JLabel(" ");
        panel.add(status);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton sendButton = new JButton("Enviar");
        buttonPanel.add(sendButton);
        // passar o lister para o controler 
        sendButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) { 
                try {
                    sendMsg(""+msgField.getText());
                    Scanner in = new Scanner(client.getInputStream());
                    status.setText(in.nextLine());
                } catch (IOException e1) {
                     err = e1.getMessage();
                }
            }
        });

        JButton clearButton = new JButton("Limpar");
        buttonPanel.add(clearButton);

        JButton exitButton = new JButton("Sair");
        buttonPanel.add(exitButton);

        panel.add(buttonPanel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    public String getMessageText() {
       
        return msgField.getText();
    }

    public void updateStatusLabel(String status) {
        // Atualizar o texto do JLabel de status
        status.setText(status);
    }
    public static void sendMsg(String msg) throws IOException {
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println(msg);
        out.flush();
        
    }
}
