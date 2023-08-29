import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Screen extends JFrame implements ActionListener {
    private JPanel panel = new JPanel(new FlowLayout());
    private JPanel panel1 = new JPanel(new FlowLayout());
    private JPanel panel2 = new JPanel(new FlowLayout());
    private JButton button = new JButton("Cadatro");
    private JButton button1 = new JButton("Pesquisa");
    private JLabel label2 = new JLabel();
    private JLabel label = new JLabel();
    private JTextField tf = new JTextField( " " );
    private JTextField tf2 = new JTextField();
    private Login login = new Login();

    public Screen() {
        setVisible(true);
        add(panel);
        add(button);
        add(button1);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            add(tf);
            remove(button);
            if(e.getSource() == button1){
                remove(button1);
                remove(tf);
                label.setText(login.getUsername());
                label2.setText(login.getPassword());
                add(label);
                add(label2);
            }

        }
        if(e.getSource() == button1){
                remove(button);
                remove(button1);
                remove(tf);
                label.setText(login.getUsername());
                label2.setText(login.getPassword());
                add(label);
                add(label2);
            }
        
    }

}