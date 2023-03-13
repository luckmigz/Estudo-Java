import javax.swing.*;


public class Main {
    public static void main(String[] args) { 
        int n,i;
        String str =" ";
        int [] m = {10,50,100,500,1000,5000,100000,500000};
        for (int g = 0; g < 10; g++){
            n = m[g];
            int[] v = new int[n];
            for (i = 0; i <n;i++){
            v[i] = 0; 
            if (i%10==0){
                str += "\n ";
            }
            else{
                str += v[i]+" ";
            }            
        }
        JOptionPane.showMessageDialog(null, "o vetor é : " + str);
    }   
}
} 
