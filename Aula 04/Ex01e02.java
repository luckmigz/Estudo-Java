import javax.swing.*;
//Exercicios 1&2
public class Ex01e02{ 
    public static void main(String[] args) {
        String g,h,j; 
        g = JOptionPane.showInputDialog("Qual ex? ");
        int a,b;    
        h = JOptionPane.showInputDialog("Qual é o 1 numero? ");
        j = JOptionPane.showInputDialog("Qual é o 2 numero? ");
        a = Integer.parseInt(h);
        b = Integer.parseInt(j);
        String z = Ex01e02.ex1(a,b,g);
        JOptionPane.showMessageDialog(null, z);
    }
    public static String ex1(int a, int b, String g){
        int c = a + b;
        System.out.println(" c : " + c  );
        String str = " ";
        switch(g) {
            case "ex1" :
            if  ( c > 10) {
                str = "seu valor: " + c;
                }
                else {
                    str = " O valor não é maior que 10";
                }
                break;
        
            case "ex2" :
                if( c <=20 ){
                    c = c - 5;
                    str = "O valor é  " +  c;
                }
                else{ 
                    str = " O valor é maior que 20";
                }
                break;
            }
            return str; 
    }
}
