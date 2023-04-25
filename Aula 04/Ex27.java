import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o verbo");
        String a = sc.nextLine(),b;
        int len = a.length();
        b = a.substring(len-2, len);
        switch(b){
            case "ar":
            System.out.println("O verbo está no infinitivo e acaba em " + b); 
            break;
            case "er":
            System.out.println("O verbo está no infinitivo e acaba em " + b); 
            break;
            case "ir":
            System.out.println("O verbo está no infinitivo e acaba em " + b); 
            break;
            case "or":
            System.out.println("O verbo pode não estar no infinitivo e acaba em " + b); 
            break; 
            case "ur":
            System.out.println("O verbo não está no infinitivo e acaba em " + b); 
            break;             
        }
        sc.close();
    }   
}
