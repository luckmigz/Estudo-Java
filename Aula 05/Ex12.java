import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Digite o numero");
            num = sc.nextInt();
            boolean s = verify(num);
            if(s == true){
               
                System.out.printf("%d é um numero primo  \n",num);
            }else{
                
                System.out.printf("%d não é um numero primo \n",num);
            }
        }while(num > 0);
        sc.close();
    }
    public static boolean mult2(int num){
        boolean s = false;
        String a = ""+num;
        int len = a.length();
        String b = a.substring(len-1,len);
        int c = Integer.parseInt(b);
       if(c%2 == 0 && c != 2){
        s = true;
        }else {
            s = false;
        }
        
        return s;
    }
    public static boolean mult3(int num){
        boolean s = false;
        if(num%3 == 0 && num != 3){
            s = true;
        }else if(num%3 != 0 ){
            s = false;
        }
        return s;
    }
    public static boolean mult5(int num){
        boolean s = false;
        if(num%5 == 0 && num !=5){
            s = true;
        }else if(num%5 != 0 ){
            s = false;
        }
        return s;
    }
    public static boolean mult7(int num){
        boolean s = false;      
        if(num%7 == 0 && num != 7){
            s = true;
        }else if(num%7 != 0 ){
            s = false;
        }
        return s;
    }
    public static boolean verify(int num){
        boolean s = true;
        if(mult2(num)){
            s = false;
        }else{
            if(mult3(num)){
                s = false;
            }else{
                if(mult5(num)){
                    s = false;
                }else{
                    if(mult7(num)){
                        s = false;
                    }else{
                        s = true;
                    }
                }
            }
        }
        return s;
    }
}
