import javax.swing.*;

public class Ex3{ 
    public static void main(String[] args){
       String str = JOptionPane.showInputDialog("Qual o valor?"),s;
       double c = Double.parseDouble(str);
       if( c > 0 ){
            s = posi(c);
           JOptionPane.showMessageDialog(null, s);
       } 
       else{
           s = nega(c);
           JOptionPane.showMessageDialog(null, s);
       }
    }
    public static String posi(double a){
        double b = Math.sqrt(a);
        String s = String.format(" A raiz de %.2f é: %.2f ", a,b);
        return s;
    }   
    public static String nega(Double a){ 
        double b = Math.pow(a, 2); 
        String s = String.format(" O quadrado de %.2f é: %.2f ",a, b);
        return s;
    }
}
