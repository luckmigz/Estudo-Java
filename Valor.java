import javax.swing.*;
public class Valor {
    public static int[] value(){
        Object [] valores = { "10 por 10", "50 por 75", "100 por 300", "500 por 200","1000 por 1000", "5000 por 7000", "10000 por 1", "50000 por 25000", "100000 por 100000", "500000 por 1000" }; //Obj de valores a serem selecionados 
        Object valor = JOptionPane.showInputDialog(null, "escolha a matriz","escolha", JOptionPane.INFORMATION_MESSAGE,null, valores, valores[0] );
        String r = String.valueOf(valor);// Convertendo de Obj pra String
        int [] b ={0,0};
        switch(r){ //Selecionando qual string e o que ocorre
            case "10 por 10": 
                b[1] = 10;
                b[0] = 10;
                return b;
            case "50 por 75":
                b[0] = 50;
                b[1] = 75;
                return b;
            case "100 por 300":
                b[0]= 100;
                b[1] = 300;
                return b;
            case "500 por 200": 
                b[0] = 500;
                b[1] = 200;
                return b;
            case "1000 por 1000": 
                b[0] = 1000;
                b[1] = 1000;
                return b;
            case "5000 por 7000":
                b[0] = 5000;
                b[1] = 7000;
                return b;
            case "10000 por 1":
                b[0] = 10000;
                b[1] = 1;
                return b;
            case "50000 por 25000": 
                b[0] = 50000;
                b[1] = 25000;
                return b;
            case "100000 por 100000":
                b[0] = 100000;
                b[1] = 100000;
                return b;
            case "500000 por 1000":
                b[0] = 500000;
                b[1] = 1000;
                return b;
        }
        return b;

    }
}
