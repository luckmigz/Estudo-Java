import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Ex11 {
    public static void main(String[] args) {    
        String a[] = Ex11.ler();
        String b = Ex11.embaralhar(a);
        for (int i = 0; i < 3; i++){
            System.out.print(a[i]);
        }
        System.out.println("\n" + b);   
       }
    public static String[] ler(){
        File file = new File("Arquivo.txt");
        
        String count[] = new String[3];
        try {
            Scanner sc = new Scanner(file);
            for(int i = 0; i < 3 ; i++){
                count[i] = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Aquivo não encontrado ");
        }
        return count; 
    }
    public static String embaralhar(String[] entre){
        int n = 3;
        String a[] = Ex11.ler();
        int inicio = 0, metade = 0, fim = 0;
        String half[] = new String[3], other[] = new String[3] ;
        int tamanho[] = new int[n];
        for (int i = 0; i <n; i++){ 
            tamanho[i] = a[i].length();
            metade = tamanho[i]/2;
            fim = tamanho[i];
            other[i] = a[i].substring(metade,fim);
            half[i] = a[i].substring(inicio,metade);
        }
        String f = half[1] + other[2] + other[1] + half[0] + half[2] + other[0];
        
        return f;
    }
    
}
