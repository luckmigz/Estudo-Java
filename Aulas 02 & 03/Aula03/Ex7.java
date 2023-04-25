import java.util.Scanner;

public class Ex7{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 5 casas");
        int b = a.nextInt();
        String c = " A dezena é: ", d = Integer.toString(b),e;
        e = d.substring(3,4);
        System.out.println(c + e) ;
        a.close();
    }
}