import java.util.Scanner;


public class Ex4 { 
    public static void main(String[] args) {
        String a,b,c; 
        int d,e,f,g;
        Scanner input = new Scanner(System.in);
        System.out.print("Diga a 1 palavra: ");
        a = input.nextLine();
        System.out.print("Diga a 2 palavra: ");
        b = input.nextLine();
        System.out.print("Diga a 3 palavra: ");
        c = input.nextLine();
        d = a.length();
        e = b.length();
        f = c.length();
        g = d+e+f;
        System.out.println("A soma do tamanho das palavras: " + g);
        input.close();

    }
}