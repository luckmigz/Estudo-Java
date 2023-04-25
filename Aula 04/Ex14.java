import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 4 casas");
        int a = scanner.nextInt();
        String s = Integer.toString(a),g;
        g = s.substring(2,4);
        a = Integer.parseInt(g);
        if(a%4==0){
            System.out.printf("O numero %d é multiplo de 4",a);
        }if(a%4!=0){
            System.out.printf("O numero %d não é multiplo de 4",a);

        }
        scanner.close();
    }
}
