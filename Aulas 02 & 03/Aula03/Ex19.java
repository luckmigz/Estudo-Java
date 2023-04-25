import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a diagonal maior e a menor do losango? ");
        double D = scanner.nextDouble(), d = scanner.nextDouble(), area = (D*d)/2;
        System.out.println("A area do losango é: " + area);
        scanner.close();
    }
}



