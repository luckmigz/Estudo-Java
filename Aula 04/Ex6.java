import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        double a = scanner.nextDouble();
        if (a > 20){
            System.out.println("O numero é maior que 20");
        }else if (a == 20){
            System.out.println("O numero é 20");
        }else if (a < 20){
            System.out.println("O numero é menor que 20");
        }
        scanner.close();
    }
}
