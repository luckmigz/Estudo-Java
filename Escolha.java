import javax.swing.*;


public class Escolha {
    public static String escolher() {
        Object[] possibleValues = { "Tempo de execução", "N de Operações"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Qual como vai analizar","Escolha",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        String z = String.valueOf(selectedValue);
        return z; 
    }
}
