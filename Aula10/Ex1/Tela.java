package Aula10.Ex1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tela extends JFrame implements ActionListener {
    private JButton exit, clear, show;
    private JLabel label;
    private JTextField text;

    public Tela(){
        super("Tela");
        exit = new JButton("Sair");
        clear = new JButton("Limpar");
        show = new JButton("Mostrar");
        text = new JTextField(" a ");
        label = new JLabel(text.getText());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(label, BorderLayout.CENTER);
        caixa.add(text, BorderLayout.CENTER);
        caixa.add(exit, BorderLayout.SOUTH);
        caixa.add(clear, BorderLayout.WEST);
        caixa.add(show, BorderLayout.EAST);
        exit.addActionListener(this);
        clear.addActionListener(this);
        show.addActionListener(this);
        setSize(200,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == exit){
            System.exit(0);
        }
        if(e.getSource() == clear){
        label = new JLabel(" ");
        }
        if(e.getSource() == show){
        String a = label.getText();
        JOptionPane.showMessageDialog(rootPane, a);
        }
    }
}
