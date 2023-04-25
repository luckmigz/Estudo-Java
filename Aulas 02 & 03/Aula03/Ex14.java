package Aula03;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1 numero:");
        double a = scanner.nextDouble();
        System.out.println("Digite o 2 numero:");
        double b = scanner.nextDouble();
        System.out.println("Digite o 3 numero:");
        double c = scanner.nextDouble();
        double x = 2*((a-c)/8)-b*5;
        System.out.println("O resultado é " + x);
        scanner.close();
    }
}
