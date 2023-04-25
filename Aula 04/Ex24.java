import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O exercicio 24 é igual ao 30");
        int v[] = new int [5];
        for( int i = 0; i < 5; i++ ) {
            System.out.println("Digite um numero ");
            int a = sc.nextInt();
            v[i] = a;
        }
        Arrays.sort(v);
        int maior = v[4];
        int menor = v[0];
        System.out.println("O maior é "+ maior + " e o menor é "+ menor);
        sc.close();
    }
    
}
