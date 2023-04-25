import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o numero?");
        double num = scanner.nextDouble();
        double quadrado = Math.pow(num,2);
        double raiz = Math.sqrt(num);
        System.out.printf("O quadrado de: " + num + " é %.2f " + "e sua raiz é: %.2f " , quadrado, raiz);
        scanner.close();


    }
}
