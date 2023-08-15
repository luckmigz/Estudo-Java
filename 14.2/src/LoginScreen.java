
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
    String user1 = " ", pass = " ";
    private User user = new User(user1,pass);

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
                user1 = tf.getText();
                pass = String.format( new String (passwordField.getPassword()));
                user.setsUser(user1);
                user.setsPass(pass);
                if( Auth.auth(user)){
                    TableMaker tableMaker = new TableMaker();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Credenciais não cadrastadas, tente novamente");
                }
                System.out.println("Click");

            }
        }
    }
   
}
