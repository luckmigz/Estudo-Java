import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {
    private JPanel panel = new JPanel(new FlowLayout());
    private JButton button = new JButton("Confirma");
    private JLabel label2 = new JLabel("Senha");
    private JLabel label = new JLabel("Usuario");
    private JTextField tf = new JTextField( " " );
    private JPasswordField passwordField = new JPasswordField( "" );
    String user = " ", pass = " ";
    public LoginScreen(){
    super( "Login" );
      setLayout( new GridLayout(3,2) ); // configura layout do frame
      add(label, BorderLayout.EAST );
      add( tf, BorderLayout.EAST ); 
      add( label2, BorderLayout.EAST);
      add( passwordField ); 
      panel.add( button );
      add(panel, BorderLayout.SOUTH);
      TextFieldHandler handler = new TextFieldHandler();
      button.addActionListener(handler);

    }
   
    private class TextFieldHandler implements ActionListener{
        public void actionPerformed( ActionEvent event ){

            if( event.getSource() == button){   
                user = tf.getText();
                pass = String.format( new String (passwordField.getPassword()));
                setPassword(pass);
                setUser(user);
                System.out.println("Click");
                
               
            }
        }
    }
    public void setPassword( String password){
        pass = password;
    }
    public void setUser( String users){
        user = users;
    }
    public String getPassword(){
         return pass;
       }
    public String getUser(){
            return user;
       }
}
