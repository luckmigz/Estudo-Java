import javax.swing.*;

public class vetor { 
    public static void main (String[] args){
        int v[]; //vetor pricipal 
        int i,n;
        String str,imp;
        imp = JOptionPane.showInputDialog("Qual o tamanho do vetor que deseja?");
        n = Integer.parseInt(imp);
        str = "";
        v = new int [n];
        for (i=0;i<n;i++){
            v[i] = 0;
            if (i%10==0) 
                str+="\n";
            else   str+= v[i]+"";
        }
        JOptionPane.showMessageDialog(null,"O Vetor é :"+ str);

    }
}