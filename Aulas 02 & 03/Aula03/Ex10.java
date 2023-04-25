package Aula03;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, base;
        System.out.print("Digite um número: ");
        num = scan.nextDouble();
        System.out.print("Digite a base: ");
        base = scan.nextDouble();
        double resultado = Math.log(num)/Math.log(base);
        System.out.println("O log de " + num + " na " + base + " é " + resultado);
        scan.close();
    }
    
}
