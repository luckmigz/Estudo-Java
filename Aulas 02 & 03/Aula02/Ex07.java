package Aula02;
import javax.swing.*;

public class Ex07 {
    public static void main(String[] args){
        String mil;
        char a,b,c,d;
        
        
 
        a = JOptionPane.showInputDialog("Digite o milhar: ").charAt(0);
        b = JOptionPane.showInputDialog("Digite a centena: ").charAt(0);
        c = JOptionPane.showInputDialog("Digite a dezena: ").charAt(0);
        d = JOptionPane.showInputDialog("Digite a unidade: ").charAt(0);
        mil = ""+ a +b +c +d;
        JOptionPane.showMessageDialog(null,"Foi digitado: "+ mil);
 
     }
    
}
