import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor do raio?");
        double raio = scanner.nextDouble();
        double area = Math.PI*Math.pow(raio,2);
        System.out.printf("A area do círculo de raio: " + raio + " é %.2f " , area);
        scanner.close();
    }
    
}
