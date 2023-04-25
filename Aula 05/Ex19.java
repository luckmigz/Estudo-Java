import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual é o valor max");
        int max = sc.nextInt();
        System.out.println("Digite qual é o incremento");
        int j = sc.nextInt();
        for(int i = 0; i <= max; i = i+j){
            System.out.printf("%d ",i);
        }
        System.out.println(";");
        sc.close();
    }
}
