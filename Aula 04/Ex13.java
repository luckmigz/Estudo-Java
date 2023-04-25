import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 3 casas");
        int a = scanner.nextInt();
        String s = Integer.toString(a),g;
        g = s.substring(1,2);
        a = Integer.parseInt(g);
        if (a%2 == 0) {
            System.out.printf("A dezena %d é par",a);
        } else if(a%2 != 0) {
            System.out.printf("A dezena %d é ímpar",a);
        }
        scanner.close();
    }
}
