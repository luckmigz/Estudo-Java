import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String codigo;
        String tipo;
        double kWh,media;
        System.out.println("Digite o codigo do consumidor");
        codigo = sc.nextLine();     
        while(!codigo.equals("0")){
            System.out.println("Digite o tipo do consumidor");
            tipo = sc.nextLine();
            System.out.println("Digite o tanto de kWh consumido esse mês");
            String k = sc.nextLine();
            kWh = Double.parseDouble(k);
            double valor = consumidor(kWh, tipo);
            if(tipo.equals("1")||tipo.equals("2")){
                media = valor/30;
                System.out.printf("O custo total mensal do consumidor %s do tipo %s é de %.2f R$ \n Seu consumo mensal foi de %.2f \n A média mensal de consumo foi de aproximadamente %.2f kWh \n",codigo,tipo,valor,kWh,media);

            }else{
                System.out.printf("O custo total mensal do consumidor %s do tipo %s é de %.2f R$ e seu consumo mensal foi de %.2f \n ",codigo,tipo,valor,kWh);
            }
            System.out.println("Digite o codigo do consumidor");
            codigo = sc.nextLine();
        }
        sc.close();
    }
    public static double consumidor(double kWh,String tipo){
        double reais = 0 ,valor;
        switch(tipo){
            case "1":
            reais = 0.3;
            break;
            case "2":
            reais = 0.5;
            break;
            case "3":
            reais = 0.7;
            break;
            case "0":
            System.out.println("Fim do programa");
            break;
        }
        valor = reais*kWh;
        return valor;
    }
    

}
