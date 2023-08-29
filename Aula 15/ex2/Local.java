import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Local extends JFrame {
    private String button,userl,passl;
    private ResourceBundle bn = null;
    private String names[] = { "Português", "English",  "Fraçais", "Deutsch" };
    private JComboBox langBox = new JComboBox(names);
    private String index; 
    private JLabel label = new JLabel("Lang: ");

    public Local(){
        setLayout(new FlowLayout());
        langBox.setMaximumRowCount(4);
        langBox.addItemListener(
            new ItemListener(){
                public void itemStateChanged( ItemEvent event ) {
                    if (event.getStateChange() == ItemEvent.SELECTED){
                        index = names[ItemEvent.SELECTED]; 
                        switch(index)
                            {  case  "Português": bn = ResourceBundle.getBundle("ex1", new Locale("pt", "BR"));
                                        break;
                            case  "English": bn = ResourceBundle.getBundle("ex1", Locale.US);
                                        break;
                            case  "Fraçais": bn = ResourceBundle.getBundle("ex1", Locale.FRANCE);
                                        break;
                            case  "Deutsch": bn = ResourceBundle.getBundle("ex1", new Locale("de","DE"));
                                        break;
                            default: bn = ResourceBundle.getBundle("ex1");
                                        break;
                            }
                            LoginScreen log1 = new LoginScreen(bn);
                            LoginScreen log = new LoginScreen();

                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            log.setSize( 325, 125 );
                            log.setVisible(true);
                            log.setResizable(false);
                            setVisible(false);
                    }
                }
            }
        );
        add(label);
        add(langBox);
    } 
    
}
