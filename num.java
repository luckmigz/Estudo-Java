import javax.swing.*;

public class num {
    public static void main(String[] args){
       String b;
        int a;
       b = JOptionPane.showInputDialog("Digite a 1 numero inteiro: ");
       a = Integer.parseInt(b);
       JOptionPane.showMessageDialog(null,"O valor do número digitado é: "+ a );

    }
}