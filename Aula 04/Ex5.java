import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        double a = scanner.nextDouble();    
        if( a > 20 && a < 90 ){
            System.out.println("O numero é maior que 20 e menor que 90");
        }
        else{
            System.out.println("O numero não é menor que 20 ou é maior que 90");
        }
        scanner.close();
    }

}
