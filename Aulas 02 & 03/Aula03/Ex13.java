package Aula03;
import java.util.Scanner;


public class Ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a data: (dd/mm/aa)");
        String date = scanner.nextLine();
        String dia, mes, ano;
        dia = date.substring(0,2);
        mes = date.substring(3,5);
        ano = date.substring(6,8);
        System.out.println("O dia é: " + dia);
        System.out.println("O mes é "+mes);
        System.out.println("O ano é " +ano);
        scanner.close();
    }
}
