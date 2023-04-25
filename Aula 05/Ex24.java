import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int voto;  
        int total = 1;
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulo = 0;
        char c = '%';
        String tabela  = " ";
        double porcand1 = 0, porcand2 = 0 , porcand3 = 0, porcand4 = 0, pornulo = 0;
         do{  
            System.out.println("Qual é o candidato?");
            voto = Integer.parseInt(sc.nextLine());    
            if(voto == 1){
                cand1++;
            }else if(voto == 2){
                cand2++;
            }else if(voto == 3){
                cand3++;
            }else if(voto == 4){
                cand4++;
            }else{ 
                if(voto > -1){
                    nulo++; 
                }
            } 
            total++;
         }while(voto > -1);
        porcand1 = 100*cand1/(total-2);
        porcand2 = 100*cand2/(total-2);
        porcand3 = 100*cand3/(total-2);
        porcand4 = 100*cand4/(total-2);
        pornulo = 100*nulo/(total-2);
        tabela += String.format("1  %d %.2f %c \n",cand1,porcand1,c);
        tabela += String.format("2  %d %.2f %c \n",cand2,porcand2,c);
        tabela += String.format("3  %d %.2f %c \n",cand3,porcand3,c);
        tabela += String.format("4  %d %.2f %c \n",cand4,porcand4,c);
        tabela += String.format("Nulos  %d %.2f %c\n",nulo,pornulo,c);
        System.out.println("Candidato   votos   percentual");
        System.out.println(tabela);
        System.out.printf(" Total total de votos : %d", (total-2)); 
        sc.close();
    }
}
