import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class tres{    
    public static void main(String[] args){
        int n,m,l,k;
        n = 10;
        m = 10;
        double a[][] = new double [n][m];
        for(l=0;l<n;l++){
            for(k=0;k<m;k++){
                a[l][k]= -1;
            }
        }
        for(l=0;l<n;l++){
            for(k=0;k<m;k++){
                System.out.printf("%2f ",a[l][k]);
            }
            System.out.printf("\n");
        }               
        
    }
    
}
