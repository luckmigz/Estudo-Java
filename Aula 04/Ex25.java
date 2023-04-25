import java.util.Scanner;

public class Ex25 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 lados do triangulo");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(); 
        if( a+b > c ){
            System.out.printf("Os lados %.2f %.2f %.2f podem formar um triangulo", a, b, c); 
        }else { 
            System.out.printf("Os lados %.2f %.2f %.2f não podem formar um triangulo", a, b, c);
        }
        sc.close();
    }
}
