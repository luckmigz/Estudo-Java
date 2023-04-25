import javax.swing.*;


public class Simetric {
    public static  void main(String[] args ){
        int c,a = 0,b = 0;
        String str = " ", sr = " ", op = " ", cont = " ";
        boolean s;
        s = false;
        String g = "----------------------------------------------------------------\n";
        String d = "Java heap space \n";
        CriaArc.criar();
        String z = Escolha.escolher();
        int[] l = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        for (int n :l){
            switch(z){
                case  "Tempo de execução":
                for(c = 0; c <5; c++){
                    
                    long startTime = System.nanoTime(), endTime;
                    try{
                        int[][] m = new int[n][n];
                        for ( a = 0; a< n; a++){
                            for ( b = 0; b<n; b++){
                                m[a][b] = a;
                                m[b][a] = b;
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
                    
                    endTime = System.nanoTime();
                    long timeElapsed = endTime - startTime;
                    sr = "O tempo foi " + timeElapsed/1000/1000 + " MiliSegundos \n";
                    System.out.println(str);
                    System.out.println(sr);
                    CriaArc.escrever(str);
                    CriaArc.escrever(sr);
                    }
                    catch(OutOfMemoryError outofMemory){
                        JOptionPane.showMessageDialog(null, "Fim de memoria");
                        CriaArc.escrever(d);
                    }   
                    
                }
                CriaArc.escrever(g);
                break;
                case "N de Operações" :
                
                    long compar = 0, aritOp = 0;
                    compar = compar +1;
                    try{
                        int[][] m = new int[n][n];
                        for ( a = 0; a< n; a++){
                            for ( b = 0; b<n; b++){
                                m[a][b] = a;
                                m[b][a] = b;
                                compar = compar +1;
                                aritOp = aritOp +1;
                                if(m[a][b] == m[b][a]){
                                    s = true;
                                    compar = compar +1;
                                }
                            }
                        }
                        if(s){
                            str = " A Matrix " + a + " por " + b + " é simétrica \n";
                            compar = compar +1;
                        }else{
                            str = " A Matrix " + a + " por " + b + " não é simétrica \n";
                            compar = compar +1;
                        }
                        cont = "Numero de comparações "+compar+"\n";
                        op = "Numero de Operaçôes aritimeticas " +aritOp+"\n";
                        System.out.println(str);
                        System.out.println(cont);
                        System.out.println(op);
                        CriaArc.escrever(str);
                        CriaArc.escrever(cont);
                        CriaArc.escrever(op);
                        CriaArc.escrever(g);
                    }
                    catch(OutOfMemoryError outofMemory){
                        JOptionPane.showMessageDialog(null, "Fim de memoria");
                        CriaArc.escrever(d);
                    }
                  
                    break;
                }
            }
            
        }

    } 

