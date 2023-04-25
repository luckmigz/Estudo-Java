import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número: "); 
        a = input.nextInt();
        double d, b = a; 
        d = Math.pow(b,2);
        System.out.println("O quadrado de " + a + " é: " + d);
        input.close();
    }

}