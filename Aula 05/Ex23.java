import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantidade = 1;  
        double total = 1;
     
        String prod = " ", tabela  = " ";
         do{
            System.out.println("Qual é o produto?");
            prod = sc.nextLine();
            System.out.println("Qual o valor?");
            double valor = Double.parseDouble(sc.nextLine());
            System.out.println("Qual a quantidade?");
            quantidade = Integer.parseInt(sc.nextLine());
            if(valor > 0 && quantidade > 0){
                tabela += String.format("%s   %d  x  %.2f R$ \n", prod, quantidade, valor);
                total = total + (valor*quantidade);
            }           
         }while(quantidade != 0);
         System.out.println("Produto  Quantidade  Valor ");
         System.out.println(tabela);
         System.out.printf(" Total : %.2f R$", total);
        sc.close();
    }
}
