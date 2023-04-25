import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Escreva um numero: ");
        double num = imput.nextDouble();
        double a  = Math.log10(num);
        System.out.println("O logaritmo de " + num + " é: " + a);
        imput.close();
    }
    
}
