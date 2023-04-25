import java.util.Scanner;



public class Ex01a9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual Ex?(1-9)");
        int n = scanner.nextInt();
        switch(n){
            case 1:
                Ex1();
                break;
            case 2:
                System.out.println("Quantos valores serão inseridos?");
                int a = scanner.nextInt();
                Ex2(a);
                break;
            case 3:
                Ex3();
                break;
            case 4:
                Ex4();
                break;
            case 5:
                Ex5();
                break;
            case 6:
                Ex6();
                break;
            case 7:
                Ex7();
                break;
            case 8:
                Ex8();
                break;
            case 9:
                Ex9();
                break;
        }


        scanner.close();
    }
    public static void Ex1(){
        int i = 0,cont = 0;
        do{
            System.out.println(i);
            i = i+2;
            cont = cont+1;
           
            }while(cont <= 20);
        
    }
    public static void Ex2(int n){
        Scanner sc = new Scanner(System.in);
        double a [] = new double [n];
        double j = 0;
        for(int i = 0; i<n; i++){
            a[i] = sc.nextDouble();
            j += a[i]; 
        }
        System.out.println(j/n);
        sc.close();
    }
    public static void Ex3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        double i = sc.nextDouble();
        while(i != 0){
            System.out.println("Digite um valor");
            i = sc.nextDouble();
            if(i<200 && i>100){
                System.out.printf("O valor %.2f está entre 100 e 200 \n",i);
            }else{
                System.out.printf("O valor %.2f não está ente 100 e 200 \n",i);
            }
        }
        sc.close();
    }
    public static void Ex4(){
        Scanner sc = new Scanner(System.in);
        String i;
        do{
            System.out.println("Digite um nome");
            i = sc.nextLine();

        }while(!i.equals("Fim"));
        sc.close();
    }
    public static void Ex5(){
        Scanner sc = new Scanner(System.in);
        double d,e,i = 0 ;
        while(i != -999){
            System.out.println("Digite um valor");
            i = sc.nextDouble();
            e = Math.sqrt(i);
            d = 1/i;
            System.out.printf("A raiz de  %.2f  é  %.2f  e seu inverso é  %.2f ",i,e,d);
        }
        
        sc.close();
    }
    public static void Ex6(){
        int i,x;
        x = 500;
        System.out.println("Os multiplos de 5 de 0 a 500 são:");
        for(i = 0;i<x;i++){
            if(i%5 == 0){
                System.out.print(i+"; ");
            }

        }
    }
    public static void Ex7(){
        int a = 120, b = 300,i;
        for(i = 1; a<=b; a++ ){
            i = i*a;
        }
        System.out.println(i);       
    }
    public static void Ex8(){
        int i,j;
        j = 1;
        System.out.println("Os numeros de 1 até 100 são:");
        for(i=1;i<=100;i++){
            System.out.println(i);
            j = j + i;

        }  
        System.out.println("A soma dos numeros é " + j);
    }
    public static void Ex9(){
      Scanner sc = new Scanner(System.in);
      int a;
      do{ 
        System.out.println("Digite o numero a ser verificado");
        System.out.println("Digite -999 para sair");
        a = sc.nextInt();
        int b,i;
        for(i=1;i<=a;i++){
            b = a%i;
            if(b == 0){
                System.out.println(i+ " é divisor de "+ a);
            }
        }
      }while(a != -999);
      sc.close(); 
    }
}

