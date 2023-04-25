import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o Dividendo? ");
        int dividendo = scanner.nextInt();
        System.out.println("Qual é o Divisor? ");
        int divisor = scanner.nextInt();
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        System.out.printf("O resultado de %d por %d é %d e o resto é %d", dividendo,divisor,quociente,resto);
        scanner.close();
    }
    
}
