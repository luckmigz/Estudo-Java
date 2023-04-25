import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double f,x;
        System.out.println("Digite qual é o numero a ser calculado");
        x = sc.nextDouble();
        double a = x;
        f = x;
        while(x>1){
            f = f*(x-1);
            --x;
        }
        System.out.printf("O fatorial de %.2f é %.2f",a,f);
    }
}