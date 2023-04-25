import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, n = 1, g = 1;
        int len1, len2;
        do{
            int [] v = new int [n];
            int [] d = new int [g];
            System.out.println("Digite a idade");
            idade = sc.nextInt();
            if(idade < 21 && idade >= 0){
                int i = 0; 
                v[i] = idade;
                i++;
                n++;
            }else if (idade > 50 && idade <= 120){
                int i = 0; 
                v[i] = idade;
                i++;
                g++;
            }
            len1 = v.length;
            len2 = d.length;
        }while(idade >= 0 && idade <= 120);
        System.out.println("O numero de pessoas com menos de 21 foi " + (len1 - 1));
        System.out.println("O numero de pessoas com mais de 50 foi " + (len2 - 1 ));
        sc.close();
    }

}
