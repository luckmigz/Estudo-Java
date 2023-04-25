import javax.swing.*;


public class Ex2 {
    public static void main(String[] args){
        double Area,b,h;
        String base,altura,A;
        base = JOptionPane.showInputDialog("Qual é a base? ");
        b = Double.parseDouble(base);
        altura = JOptionPane.showInputDialog("Qual é a altura? ");
        h = Double.parseDouble(altura);
        Area = (b*h);
        A = String.valueOf(Area);
        JOptionPane.showMessageDialog(null, A);
    }
}
