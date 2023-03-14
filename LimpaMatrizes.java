import javax.swing.*;
public class LimpaMatrizes {

    public static void main(String[] args) throws OutOfMemoryError {
        int l,k,i;
        String s,c;
        String str =" ";
        String a1 = JOptionPane.showInputDialog("Qual o Exercicio ? \n");
        String g = "----------------------------------------------------------------\n", out = "Fim de memoria";
        CriaArc.criar(); 
        CriaArc.escrever(a1 + "\n ");
        CriaArc.escrever("\n");
        int[][] dimensoes = {{10, 10}, {50, 75}, {100, 300}, {500, 200}, {1000, 1000}, {5000, 7000}, {10000, 1}, {50000, 25000}, {100000, 100000}, {500000, 1000}};
        for(i=0;i<5;i++){    
            long compar = 0, aritOp = 0;
            for (int[] dimensao : dimensoes) {
                int n = dimensao[0];
                int m = dimensao[1];
                double a[][] = new double [n][m];
                compar = compar +1;
                try{ 
                    for(l=0;l<n;l++){
                        for(k=0;k<m;k++){
                            a[l][k]= -1;
                            str = "Matriz " + n + " por " + m +" limpa";
                            compar = compar +1;
                            aritOp = aritOp +1;
                            }
                            compar = compar +1;
                            aritOp = aritOp +1;
                        }
                    } catch(OutOfMemoryError outofMemory){
                    JOptionPane.showMessageDialog(null, "Fim de memoria");
                    CriaArc.escrever(out);}
                    JOptionPane.showMessageDialog(null, str);
                    JOptionPane.showMessageDialog(null, "Comparacoes:   " + compar);
                    JOptionPane.showMessageDialog(null,"Arit Op:   " + aritOp);
                    s  = " Numero de comparações : "+compar+"\n";
                    c = " Numero de Operaçôes aritimeticas : " +aritOp+"\n";  
                    CriaArc.escrever(s);
                    CriaArc.escrever(c);
                } 
                
                CriaArc.escrever(g);
        }
    }
}