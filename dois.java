import javax.swing.*;

public class dois{
    public static void main(String[] args){
        int[] tamanhos = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};       
        int i;
        String str =" ";
        String g = "----------------------------------------------------------------\n";
        String j = Escolha.escolher();
        CriaArc.criar();
        switch(j){ 
            case "Tempo de execução" :
                for ( int n : tamanhos) {
                    int[] v = new int[n];
                    int[] d = new int[n];
                    for(int h = 0; h < 5; h++){
                        long startTime = System.nanoTime();
                        for (i = 0; i <n; i++){
                            v[i] = i; 
                            d[i] = v[i];
                            str += ""+ d[i] + " " + v[i];
                        } 
                        JOptionPane.showMessageDialog(null,"O vetor é: "+str);
                        str = "";
                        long endTime = System.nanoTime();
                        long timeElapsed = endTime - startTime;
                        String tempo = "tempo decorrido: " + timeElapsed/1000/1000 + " milisegundos" + "\n";
                        CriaArc.escrever("O vetor é:  " + n);
                        CriaArc.escrever(tempo);
                        JOptionPane.showMessageDialog(null, "Tempo de execução do Programa em MiliSegundos:   " + timeElapsed/1000/1000 + " Milisegundos");
                    }
            CriaArc.escrever(g);
        }
            break;
            case "N de Operações" : 
                for ( int n : tamanhos){
                    int[] v = new int[n];
                    int[] d = new int[n];
                    for(i=0;i<5;i++){  
                        long compar = 0, aritOp = 0;
                        compar = compar + 1;
                        for (i = 0; i <n;i++){
                            v[i] = i; 
                            d[i] = v[i];
                            str += ""+ d[i] + " " + v[i];
                            compar = compar + 1;
                            aritOp = aritOp + 1;
                        }
                    JOptionPane.showMessageDialog(null, "Comparacoes:   " + compar);
                    JOptionPane.showMessageDialog(null,"Arit Op:   " + aritOp);
                    String s,c;
                    s  = " Numero de comparações"+compar+"\n";
                    c = " Numero de Operaçôes aritimeticas" +aritOp+"\n";
                    CriaArc.escrever(s);
                    CriaArc.escrever(c);
                } 
                g = "----------------------------------------------------------------\n";
                CriaArc.escrever(g);
                break;
                }
        }
    }
}