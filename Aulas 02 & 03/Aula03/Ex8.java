import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Qual é o angulo?");
        double an = a.nextDouble();
        double angulo = Math.toRadians(an);
        double sen,cos,sec,cosec,tg,cotg;
        sen = Math.sin(angulo);
        cos = Math.cos(angulo);
        sec = 1/cos;
        cosec = 1/sen;
        tg = Math.tan(angulo);
        cotg = 1/tg;

        System.out.printf("Seno de " + an + " : %.2f \n" ,sen);
        System.out.printf("Cosseno de " + an + " : %.2f \n" , cos);
        System.out.printf("Tangente de " + an + " : %.2f \n" , tg);
        System.out.printf("Secante de " + an + " : %.2f \n" , sec);
        System.out.printf("Cossecante de " + an + " : %.2f \n" , cosec);
        System.out.printf("Cotangente de " + an + " : %.2f \n" , cotg);
        a.close();
    }
    
}
