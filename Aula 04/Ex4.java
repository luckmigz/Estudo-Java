import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        double a = scanner.nextDouble();
        System.out.println("Digite outro numero");
        double b = scanner.nextDouble();
        System.out.println("Digite mais um numero");
        double c = scanner.nextDouble();
        System.out.println(compar(a,b,c));
        scanner.close();
        
    }
    public static String compar(double a, double b, double c) {
        String g = " ";
        if (a > b && a > c) {
            if(b > c ){
                g = String.format(" %.2f ; %.2f  ; %.2f ",a,b,c) ;
               
            }
            if (c > b){
                g = String.format(" %.2f ; %.2f  ; %.2f ",a,c,b) ;
                
            }
        } else if (b > a && b > c) {
            if (c < a ) {
                g = String.format(" %.2f ; %.2f  ; %.2f ",b,c,a) ;
                
            }
            if (a > c) {
                g = String.format(" %.2f ; %.2f  ; %.2f ",b,a,c) ;
                
            }
        } else if(c > a && c > b) {
            if (b > a) {
                g = String.format(" %.2f ; %.2f  ; %.2f ",c,b,a) ;
                
            }
            if (a > b) {
                g = String.format(" %.2f ; %.2f  ; %.2f ",c,a,b) ;
                
            }
        }
        return g; 
    }
}

