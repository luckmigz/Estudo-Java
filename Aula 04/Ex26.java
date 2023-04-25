import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 lados do triangulo");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(); 
        if( a == b && c == a && c == b){
            System.out.printf("O triangulo de %.2f %.2f %.2f é um triangulo equilátero", a, b, c);
        }else if (a == b || b == c || c == a){
            System.out.printf("O triangulo de %.2f %.2f %.2f é um triangulo isósceles", a, b, c);
        }else{
            System.out.printf("O triangulo de %.2f %.2f %.2f é um triangulo escaleno", a, b, c);
        }
        sc.close();
    }
}
