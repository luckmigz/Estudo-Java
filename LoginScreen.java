import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {
      

    public LoginScreen(){
        this.setTitle("Login");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(2,3));
        JPanel panel = new JPanel();
        this.add(panel,CENTER_ALIGNMENT);
        JButton confirm = new JButton("Confirma"); 
        panel.add(confirm,BOTTOM_ALIGNMENT);
        JTextField password = new JTextField( );
        JTextField username = new JTextField( );
        panel.add(password);
        panel.add(username);
    }
}
