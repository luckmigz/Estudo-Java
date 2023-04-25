import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de casas de fibonacci ");
        int n = sc.nextInt();
        String str = "";
        int f = 0, g = 1, h;
        for (int i = 0; i <= n; i++) {
            str += f + ""; 
            h = f + g;
            f = g;
            g = h;
        }
        str += ";";
        System.out.println(str);
        sc.close();
    }
}
