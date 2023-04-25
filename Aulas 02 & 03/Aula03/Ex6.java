package Aula03;
import java.util.Scanner;


public class Ex6 { 
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Qual é o valor inicial? ");
        double valorInc = a.nextDouble();
        System.out.println("Qual é o valor do juros? ");
        float juros = a.nextFloat();
        System.out.println("Por quantos meses ?");
        int meses = a.nextInt();
        Ex6.conta(valorInc,juros,meses);
        a.close();

    }   
    public static void conta(double valIn, float j, int n){
        double valFin = valIn*Math.pow((1+j/100),n);
        System.out.printf("O valor final é: %.2f R$", valFin );
        
    }
}