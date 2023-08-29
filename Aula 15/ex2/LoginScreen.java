
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ResourceBundle;

public class LoginScreen extends JFrame {
    String user1 = " ", pass = " ", bt, l2,l1,er;
    private JPanel panel = new JPanel(new FlowLayout());
    private JButton button = new JButton(bt);
    private JLabel label2 = new JLabel(l2);
    private JLabel label = new JLabel(l1);
    private JTextField tf = new JTextField( " " );
    private JPasswordField passwordField = new JPasswordField( "" );
    
    private User user = new User(user1,pass);

    public LoginScreen(ResourceBundle bn){
        bt = bn.getString("login.button");
        l2 = bn.getString("login.pass");
        l1 = bn.getString("login.user");
        er = bn.getString("login.errormsg");
    }

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
                    JOptionPane.showMessageDialog(null,er);
                }
                System.out.println("Click");

            }
        }
    }
   
}
