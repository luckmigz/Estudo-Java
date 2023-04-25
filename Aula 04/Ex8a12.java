import java.util.Scanner;

public class Ex8a12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual Ex?(8-12)");
        int n = sc.nextInt();
        switch(n){
            case 8:
                System.out.print("Digite o primeiro valor: ");
                double a = sc.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double b = sc.nextDouble();
                Ex8(a,b);
                break;
            case 9: 
                System.out.print("Digite o numero: ");
                a = sc.nextDouble();
                Ex9(a);
                break;
            case 10:
                System.out.print("Digite o numero: ");
                a = sc.nextDouble();
                Ex10(a);
                break;
            case 11:
                System.out.print("Digite o numero: ");
                a = sc.nextDouble();
                Ex11(a);
                break;
            case 12:
                System.out.print("Digite o numero: ");
                a = sc.nextDouble();
                Ex12(a);
                break;
        }
        sc.close();
    }
    public static void Ex8(double a, double b){
        if(a>b){
            System.out.printf("O maior valor é %.1f ",a);
        }
        else{ 
            System.out.printf("O maior valor é %.1f ",b);
        }
    }
    public static void Ex9(double a){
        if(a%3 == 0){
            System.out.printf("%.2f é multiplo de 3",a);
        }
        else{
            System.out.printf("%.2f não é multiplo de 3",a);
        }
    }
    public static void Ex10(double a){
        if(a%5 == 0){
            System.out.printf("%.0f é divisível por 5",a);
        }
        else{
            System.out.printf("%.0f não é divisível por 5",a);
        }
    }
    public static void Ex11(double a){
        if(a%7 == 0 && a%3 == 0){
            System.out.printf("%.0f é divisível por 3 e 7",a);
        }
        else if(a%7 == 0 && a%3 != 0){
            System.out.printf("%.0f é divisível por 7 mas não por 3",a);
        }    
        else if(a%3 == 0 && a%7 != 0){
            System.out.printf("%.0f é divisível por 3 mas não por 7",a);
        }
        else{
            System.out.printf("%.0f não é divisível nem por 3 nem 7",a);
        }
    }
    public static void Ex12(double a){
        if(a%10 == 0){
            if(a%5 == 0){
                if(a%2 == 0){
                    System.out.printf("%.0f é divisível por 10, 5 e 2",a);
                }
                else{
                    System.out.printf("%.0f é divisível por 10 e 5 mas não por 2",a);
                }
            }
            else{
                if(a%2 == 0){
                    System.out.printf("%.0f é divisível de 10 e 2 mas não por 5",a);
                }
                else{
                    System.out.printf("%.0f é divisível só por 10 ",a);
                }
            }
        }
        else{
            if(a%5 == 0){
                if(a%2 == 0){
                    System.out.printf("%.0f é divisível por 5 e 2 mas não por 10",a);
                }
                else{
                    System.out.printf("%.0f é divisível só por 5  ",a);
                }
            }
            else{
                if(a%2 == 0){
                    System.out.printf("%.0f é divisível só de 2 ",a);
                }
                else{
                    System.out.printf("%.0f não é divisível por 10, 5 nem 2",a);
                }
            }
        }
    }

}
