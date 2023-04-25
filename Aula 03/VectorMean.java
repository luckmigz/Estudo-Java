import java.util.Scanner;

public class VectorMean {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o tamanho do vetor?");
        int n = sc.nextInt();
        double a [] = new double [n];
        double j = 0;
        for(int i = 0; i<n; i++){
            System.out.printf("Insira o valor da posição %d \n", i);
            a[i] = sc.nextDouble();
            j += a[i]; 
        }
        System.out.println("A média total dos valores do vetor é " + j/n);
        sc.close();
    }
}
