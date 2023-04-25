import java.util.Scanner;


public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        System.out.println("Digite um numero \nDigite -9999 para sair e exibir o maior "); 
        int n = sc.nextInt();
        while(n != -9999){  
            if(n > maior){
                maior = n;
            }
            System.out.println("Digite um numero \nDigite -9999 para sair e exibir o maior "); 
            n = sc.nextInt();   
        } 
        System.out.println("O maior numero digitado é "+ maior );
        sc.close();
    }
}
