import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double a,b, r;
         do{
            System.out.printf("\nOperações Disponíveis:\n 1. Adição;\n 2. Subtração;\n 3. Multiplicação; \n 4. Divisão; \n 9. Sair do Programa. \nDigite o número de ordem da opção desejada:  ");            
            op = Integer.parseInt(sc.nextLine());
            if(op >0 && op < 5){
                System.out.println("Digite os 2 valores: ");
                System.out.printf(" a: ");
                a = Double.parseDouble(sc.nextLine());
                System.out.printf(" b: ");
                b = Double.parseDouble(sc.nextLine());
                switch(op){
                    case 1:
                    r = a + b;
                    System.out.printf("O resultado da soma é %.2f",r);
                    break;
                    case 2:
                    r = a - b;
                    System.out.printf("O resultado da subtração é %.2f",r);

                    break;
                    case 3:
                    r = a * b;
                    System.out.printf("O resultado da multiplicação é %.2f",r);

                    break;
                    case 4:
                        if(b == 0){ 
                        System.out.println("NÃO DIVIDIRÁS POR 0");
                        } else { 
                            r = a / b;
                            System.out.printf("O resultado da divisão de %.2f por %.2f é %.2f \n",a,b,r);

                        }
                    break;
                }
            }
            
         }while(op != 9);
         
         
        sc.close();
    }
}
