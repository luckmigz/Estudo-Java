package Aula02;
import javax.swing.*;

public class Ex02 {
    public static void main(String[] args){
        String a, b, c; 
        a = JOptionPane.showInputDialog("Digite a 1 palavra: ");
        b = JOptionPane.showInputDialog("Digite a 2 palavra: ");
        c = JOptionPane.showInputDialog("Digite a 3 palavra: ");
       // a.charAt(0);
        JOptionPane.showMessageDialog(null,"Foi digitado: "+ c + " " + b + " " + a );

    }
}
