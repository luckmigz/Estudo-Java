import java.util.Scanner;

public class Ex21a23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o exercio (21-23)");
        int n = scanner.nextInt();
        switch (n) {
            case 21:
                System.out.println("Escreva 3 numeros");
                int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
                if (a > b && a > c){
                    System.out.println(a);
                } if(b > c && a > c){
                    System.out.println(b);
                } if(c > b && a > c){
                    System.out.println(c);
                }
                break;
            case 22:
                System.out.println("Escreva 3 numeros");
                a = scanner.nextInt(); 
                b = scanner.nextInt();
                c = scanner.nextInt();
                int maior = 0; 
                if (a > b && a> c ){
                    maior = a;
                } if (b > c && b >a) {
                    maior = b;
                } if (c > a && c >b ) {
                    maior = c;
                }
                System.out.println("O maior numero é " + maior);
                break;
            case 23:
            System.out.println("O exercicio 23 é igual ao 29");
            System.out.println("Escreva 3 numeros");
                a = scanner.nextInt(); 
                b = scanner.nextInt();
                c = scanner.nextInt();
                maior = 0;
                int menor = 0, intermediario = 0; 
                if (a > b && a> c && b >c){
                    maior = a;
                    intermediario = b;
                    menor = c;
                } if (b > c && b >a && a > c) {
                    maior = b;
                    intermediario = a;
                    menor = c;
                } if (c > a && c >b && a > b) {
                    maior = c;
                    intermediario = a;
                    menor = b;
                } if (a > b && a> c && c > b){
                    maior = a;
                    intermediario = c;
                    menor = b;
                } if (b > c && b >a && a < c) {
                    maior = b;
                    intermediario = c;
                    menor = a;
                } if (c > a && c >b && a < b) {
                    maior = c;
                    intermediario = b;
                    menor = a;
                }


                System.out.println("A ordem é " + maior + " > " + intermediario + " > " + menor );
                break;
            }
            scanner.close();
    }
}
