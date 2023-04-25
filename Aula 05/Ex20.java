import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome,sexo;
        int idade;
        for(int i=0; i<20; i++){
            System.out.println("Digite o nome");
            nome = sc.nextLine();
            System.out.println("Digite o sexo");
            sexo = sc.nextLine();
            System.out.println("Digite o idade");
            idade = Integer.parseInt(sc.nextLine());
            if(idade > 21 && sexo.equals("Masc")){
                System.out.printf("\n %s \n \n",nome);
            }
        }
        sc.close();
    }
}
