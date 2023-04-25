import javax.swing.*;



public class matrix {
    public static void main(String[] args){ 
        int l,k,i,n,m;
        String str =" ";
        int[] t = Valor.value(); 
        n = t[0];
        m = t[1];
        Object[] possibleValues = { "Tempo de execução", "N de Operações"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Qual como vai analizar","Escolha",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        String z = String.valueOf(selectedValue);
        CriaArc.criar();
        switch(z){
            case "Tempo de execução" : 
                    long startTime = System.nanoTime();
                  
                    for(i=0;i<5;i++){try{ 
                        double a[][] = new double [n][m];
                        for(l=0;l<n;l++){
                            for(k=0;k<m;k++){
                                a[l][k]= -1;
                                str = "Matriz " + n + " por " + m +" limpa";
                            }
                        }
                        long endTime = System.nanoTime();
                        long timeElapsed = endTime - startTime;
                        String tempo = "tempo decorrido: " + timeElapsed/1000/1000 + " milisegundos" + "\n";
                        CriaArc.escrever(tempo);
                        JOptionPane.showMessageDialog(null, "Tempo de execução do Programa em MiliSegundos:   " + timeElapsed/1000/1000 + " Milisegundos");
                }catch(OutOfMemoryError outofMemory){JOptionPane.showMessageDialog(null, "Fim de memoria");
                }}
                JOptionPane.showMessageDialog(null, str); 
                String g = "----------------------------------------------------------------\n";
                CriaArc.escrever(g);
            break;
            case "N de Operações" : 
                double a[][] = new double [n][m];
                for(i=0;i<5;i++){
                    long compar = 0, aritOp = 0;
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
                    }JOptionPane.showMessageDialog(null, str);
                } catch(OutOfMemoryError outofMemory){
                JOptionPane.showMessageDialog(null, "Fim de memoria");}
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
    




           
       
