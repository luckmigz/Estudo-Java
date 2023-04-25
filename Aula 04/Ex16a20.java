import java.util.Scanner;

public class Ex16a20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual exercio?(16-20)");
        int e = sc.nextInt();
        switch(e){
            case 16:
                System.out.println("Digite 2 numeros");
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                if(n1 == n2){
                    System.out.printf("%.2f é igual ao %.2f ",n1, n2);
                }
                else if(n2 != n1){
                    System.out.printf("%.2f é diferente de %.2f ",n1, n2);
                }
                break;
            case 17:
            System.out.println("Digite 2 numeros");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                if(n1>n2){
                    System.out.println("O menor é " + n2);
                }
                else if(n2>n1){
                    System.out.println("O menor é " + n1);
                }
                break;
            case 18:
                System.out.println("Digite 2 numeros");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                if(n1<n2){
                System.out.println(n1 + " ; " + n2);
                }
                else if(n2<n1){
                System.out.println(n2 + " ; " + n1);
                }
                break;
            case 19:
                System.out.println("Digite 2 numeros");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();   
                if(n1>n2){
                System.out.println(n1 + " ; " + n2);
                }
                else if(n2>n1){
                System.out.println(n2 + " ; " + n1);
                }
                
                break;
            case 20:
                System.out.println("Digite 2 numeros");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                if(n1>n2){
                double a =  Math.pow(n2,2);
                double b =  Math.sqrt(n1);        
                System.out.printf("O quadrado de %.2f é %.2f e a raiz de %.2f é %.2f",n2,a,n1,b);
                }
                else if(n2>n1){
                    double a =  Math.pow(n1,2);
                    double b =  Math.sqrt(n2);        
                    System.out.printf("O quadrado de %.2f é %.2f e a raiz de %.2f é %.2f",n1,a,n2,b);
                }
                
                break;    
        }
        sc.close();
    }
}
