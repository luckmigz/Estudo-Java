import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a amplitude termica(F) ");
        System.out.println("Max temp");
        float maxtemp = sc.nextFloat();
        System.out.println("Min temp");
        float mintemp = sc.nextFloat();
        float gradC;
        System.out.println("------------------------");
        for(float i = mintemp; i <= maxtemp; i++){
            gradC = 5*(i-32)/9;
            System.out.printf("| %.2f Fº | %.2f Cº | \n", i, gradC);
        }   
        System.out.println("------------------------");
        sc.close();
    }
}
