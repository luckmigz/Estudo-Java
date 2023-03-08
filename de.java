import javax.swing.*;

public class de {
    public static void main(String[] args){
        float p,a;
        String pe,al;
        pe = JOptionPane.showInputDialog("Peso em Kg");
        p = Float.parseFloat(pe);
        al = JOptionPane.showInputDialog("Altura em m");
        a = Float.parseFloat(al);
        JOptionPane.showMessageDialog(null,"Seus dados foram: " + p +" Kg " + " e " + a+" m " );

        }
}