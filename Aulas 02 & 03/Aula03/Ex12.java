import java.util.Scanner;



public class Ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a data: (ddmmaa)");
        int data = scanner.nextInt();
        String date = Integer.toString(data);
        String dia, mes, ano;
        dia = date.substring(0,2);
        mes = date.substring(2,4);
        ano = date.substring(4,6);
        System.out.println("O dia é: " + dia);
        System.out.println("O mes é "+mes);
        System.out.println("O ano é " +ano);
        scanner.close();
        

    }
    
}
