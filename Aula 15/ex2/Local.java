import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Local extends JFrame {
    private String button,userl,passl;
    private ResourceBundle bn = null;
    private String names[] = { "Português", "English",  "Fraçais", "Deutsch" };
    private JComboBox langBox = new JComboBox(names);
    private String index; 

    public Local(){
        setLayout(new FlowLayout());
        langBox.setMaximumSize(getMaximumSize());
        langBox.addItemListener(
            new ItemListener(){
                public void itemStateChanged( ItemEvent event ) {
                    if (event.getStateChange() == ItemEvent.SELECTED){
                        index = names[ItemEvent.SELECTED]; 

                    }
                }
            }
        );
        
    } 
    public String getLang(){
            switch(index){
                case 1: 
                bn = ResourceBundle.getBundle("ex1", new Locale("pt", "BR"));
            }
            return ; 
        }
}
