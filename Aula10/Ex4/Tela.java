package Aula10.Ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Tela extends JFrame implements ActionListener {
    private JButton desempregado, terefeiro, comissionado, horista, mensalista,vendedor,save, save2;
    private JLabel label, label2, label3, label4;
    private JTextField textField, textField2, textField3, textField4;
    private String text;
    public Tela(){
        super("Tela");
        Comissionado comis = new Comissionado();
        desempregado = new JButton("Desempregado");
        terefeiro = new JButton("Terefeiro");
        comissionado = new JButton("Comissionado");
        horista = new JButton("Horista");
        mensalista = new JButton("Mensalista");
        vendedor = new JButton("Vendedor");
        save = new JButton("Adicionar salario");
        save2 = new JButton("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        label = new JLabel(text);

    }
    public void getText(String text) {
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
