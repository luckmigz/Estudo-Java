import javax.swing.*;

public class data {
    public static void main(String[] args){
      String dia, mes , ano;
      int dd, mm, aa;
      dia = JOptionPane.showInputDialog("Que dia é hoje?(dd) ");
      dia = String.format("%2.2s",dia);
      mes = JOptionPane.showInputDialog("De que mes?(mm) ");
      mes = String.format("%2.2s",mes);
      ano = JOptionPane.showInputDialog("E o ano?(aaaa) ");
      ano = String.format("%4.4s",ano);
      dd = Integer.parseInt(dia);
      mm = Integer.parseInt(mes);
      aa = Integer.parseInt(ano);
      JOptionPane.showMessageDialog(null,"A data digitada é: "+ dd +"/" + mm + "/" + aa);

    }
}