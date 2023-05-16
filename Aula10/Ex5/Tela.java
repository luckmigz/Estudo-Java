package Aula10.Ex5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame implements ActionListener {
    private JButton bt, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15;
    private JLabel lb;
    private JTextField tf;
    private JPanel keys, screen;
    private String string = "0", str;
    private int op, val, val2, valf;

    public Tela(){
        super("Calculadora");
        bt = new JButton("1");
        bt1 = new JButton("2");
        bt2 = new JButton("3");
        bt3 = new JButton("4");
        bt4 = new JButton("5");
        bt5 = new JButton("6");
        bt6 = new JButton("7");
        bt7 = new JButton("8");
        bt8 = new JButton("9");
        bt9 = new JButton("=");
        bt10 = new JButton("C");
        bt11 = new JButton("/");
        bt12 = new JButton("*");
        bt13 = new JButton("-");
        bt14 = new JButton("+");
        bt15 = new JButton("0");
        lb = new JLabel(string);
        tf = new JTextField("0");
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel keys = new JPanel(new GridLayout(4,4));
        JPanel screen = new JPanel(new FlowLayout());
        cp.add(keys, BorderLayout.SOUTH);
        cp.add(screen, BorderLayout.CENTER);
        keys.add(bt6);
        keys.add(bt7);
        keys.add(bt8);
        keys.add(bt14);
        keys.add(bt3);
        keys.add(bt4);
        keys.add(bt5);
        keys.add(bt13);
        keys.add(bt);
        keys.add(bt1);
        keys.add(bt2);
        keys.add(bt12);
        keys.add(bt15);
        keys.add(bt10);
        keys.add(bt9);
        keys.add(bt11);
        screen.add(lb);
        //screen.add(tf);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
       

        setSize(500,600);
        setVisible(true);
    }  


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bt){
            if(lb.getText().equals("0")){
                string = "1";
                lb.setText(string);
            }else{
                string += "1";
                lb.setText(string);
            }

        }
        if(e.getSource() == bt1){
            if(lb.getText().equals("0")){
                string = "2";
                lb.setText(string);
            }else{
                string += "2";
                lb.setText(string);
            }

        }
        if(e.getSource() == bt2){
            if(lb.getText().equals("0")){
                string = "3";
                lb.setText(string);
            }else{
                string += "3";
                lb.setText(string);
            }

        }
        if(e.getSource() == bt3){
            if(lb.getText().equals("0")){
                string = "4";
                lb.setText(string);
            }else{
                string += "4";
                lb.setText(string);
            }

        }
        if(e.getSource() == bt4){
            if(lb.getText().equals("0")){
                string = "5";
                lb.setText(string);
            }else{
                string += "5";
                lb.setText(string);
            }
        }
        if(e.getSource() == bt5){
            if(lb.getText().equals("0")){
                string = "6";
                lb.setText(string);
            }else{
                string += "6";
                lb.setText(string);
            }
        }
        if(e.getSource() == bt6){
            if(lb.getText().equals("0")){
                string = "7";
                lb.setText(string);
            }else{
                string += "7";
                lb.setText(string);
            }
        }
        if(e.getSource() == bt7){
            if(lb.getText().equals("0")){
                string = "8";
                lb.setText(string);
            }else{
                string += "8";
                lb.setText(string);
            }
        }
        if(e.getSource() == bt8){
            if(lb.getText().equals("0")){
                string = "9";
                lb.setText(string);
            }else{
                string += "9";
                lb.setText(string);
            }
        }
        if(e.getSource() == bt9){
            switch(op){
                case 1:            
                string = lb.getText();
                val2 = Integer.parseInt(string);
                valf = val2+val;
                string = " "+valf;
                lb.setText(string);
                break;
                case 2:
                string = lb.getText();
                val2 = Integer.parseInt(string);
                valf = val - val2;
                string = " "+valf;
                lb.setText(string);
                break;
                case 3:
                string = lb.getText();
                val2 = Integer.parseInt(string);
                valf = val2*val;
                string = " "+valf;
                lb.setText(string);
                break;
                case 4:
                string = lb.getText();
                val2 = Integer.parseInt(string);
                valf = val/val2;
                string = " "+valf;
                lb.setText(string);
                break;
            }
        }
        if(e.getSource() == bt10){
            string = "0";
            lb.setText(string);
            val = 0;
            val2 = 0;

        }
        if(e.getSource() == bt11){
            op = 4;
            str = lb.getText();  
            val = Integer.parseInt(str);
            string = "0";
            lb.setText(string);
        }
        if(e.getSource() == bt12){
            op = 3;
            str = lb.getText();  
            val = Integer.parseInt(str);
            string = "0";
            lb.setText(string);
        }
        if(e.getSource() == bt13){
            op = 2;
            str = lb.getText();  
            val = Integer.parseInt(str);
            string = "0";
            lb.setText(string);
        }
        if(e.getSource() == bt14){
            op = 1;
            str = lb.getText();  
            val = Integer.parseInt(str);
            string = "0";
            lb.setText(string);
        }
        if(e.getSource() == bt15){
            if(lb.getText().equals("0")){
                string = "0";
                lb.setText(string);
            }else{
                string += "0";
                lb.setText(string);
            }
        }
    }
}
