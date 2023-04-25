import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a base e altura do triangulo? ");
        double h = scanner.nextDouble(), b = scanner.nextDouble(), area = (h*b)/2;
        System.out.println("A area do trigulo é: " + area);
        scanner.close();
    }
    
}
