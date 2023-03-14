import javax.swing.*;

public class Main {
    public static void  main(String[] args) {
        Jogo a = new Jogo();
        String k = JOptionPane.showInputDialog("Pedra, Papel ou Tesoura?");
        String s = a.jogar(k);
        JOptionPane.showMessageDialog(null,s);
        
    }
}
