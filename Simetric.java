import javax.swing.*;


public class Simetric {
    public static  void main(String[] args ){
        int c,d,a = 0,b = 0;
        String str = " ";
        boolean s;
        s = false;
        int[] l = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        for (int n :l){
            int[][] m = new int[n][n];
            for ( a = 0; a< n; a++){
                for ( b = 0; b<n; b++){
                    m[a][b] = a;
                    m[b][a] = a;
                    if(m[a][b] == m[b][a]){
                         s = true;
                    }
                }
            }
            if(s){
                str = " A Matrix " + a + " por " + b + " é simétrica ";
            }else{
                str = " A Matrix " + a + " por " + b + " não é simétrica ";
            }
            System.out.println(str);
        }

    } 
}