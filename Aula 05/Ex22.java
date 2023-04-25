import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual é o valor max");
        int max = sc.nextInt();        
        for(int i = 2; i < max; i++){
            if(i%2 == 0){
                System.out.printf(" %d ", i);
            }
        }
        System.out.println(";");
        sc.close();
    }
}
