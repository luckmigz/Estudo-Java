package Aula20.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class UI  extends JFrame {
    private JTextField msgField;
    private JLabel status;
    private String err; 
    private static Socket client; 

    public UI() {
        setVisible(true);
        setTitle("Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        msgField = new JTextField();
        panel.add(msgField);

        String statustext = " ";
        status = new JLabel(statustext);
         try {
            statustext = clientInit();
            status.setText(statustext);
          
        } catch (IOException e) {
            err = e.getMessage();
            status.setText(err);
        }
   
    
        panel.add(status);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton sendButton = new JButton("Enviar");
        buttonPanel.add(sendButton);
        
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

        clearButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) { 
                msgField.setText("");
                try {
               sendMsg(msgField.getText());
                } catch (IOException e1) {
                    err = e1.getMessage();
                }
            }
        });



        JButton exitButton = new JButton("Sair");
        buttonPanel.add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) { 
               System.exit(0);
            }
        });
        

        panel.add(buttonPanel);
        
        add(panel);
        pack();
        setLocationRelativeTo(null);
      
        
    }

    public static String clientInit() throws UnknownHostException, IOException{
        client = new Socket(Server.adress, Server.port);
        String a = Server.adress + ":" + Server.port;
        return a; 

    }
    public static void sendMsg(String msg) throws IOException {
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println(msg);
        out.flush();
        
    }
 
}
