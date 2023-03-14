import javax.swing.*;


public class Simetric {
    public static  void main(String[] args ){
        int c,d,a = 0,b = 0;
        String str = " ", sr = " ";
        boolean s;
        s = false;
        String z = Escolha.escolher();
        int[] l = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        for (int n :l){
            switch(z){
                case  "Tempo de execução":
                for(c = 0; c <5; c++){
                    long startTime = System.nanoTime(), endTime;
    
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
                }
                case "N de Operações" :
                for(c = 0; c <5; c++){
                    long startTime = System.nanoTime(), endTime;
    
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
                }
            }
            
        }

    } 
}
