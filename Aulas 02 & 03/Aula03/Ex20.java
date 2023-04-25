import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1 lado do triangulo");
        double a = scanner.nextDouble();
        System.out.println("Digite o 2 lado do triangulo");
        double b = scanner.nextDouble();
        System.out.println("Digite o angulo entre os lados");
        double angulo = scanner.nextDouble();
        angulo = Math.toRadians(angulo);
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(angulo));
        angulo = Math.toDegrees(angulo);
        System.out.printf("O 3 lado do triangulo formado pelos lados %.2f e %.2f e o angulo de %.2f º é %.2f ",a,b,angulo,c);
        scanner.close();
    }
    
}
