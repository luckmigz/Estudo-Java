import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //String a = Ex5.importar();
        File arquivo = new File("C:\\Users\\Edição Eco TV\\Documents\\LUCAS\\estudoJava\\a.txt");
        int i = 0;
        String v[] = new String [10];
        try (Scanner sc = new Scanner(arquivo)) {
            for(i = 0; i <10; i++){
                v[i]  = sc.nextLine();
                System.out.println(v[i]);
            }
            for(i = 9; i <=10; --i){
                if(i == -1){
                    break;
                }else{ 
                    System.out.println(v[i]);
                }
            }                
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("O arquivo não foi encontrado!");
        }
    }   
    public static String importar(){
        String a; 
        try (Scanner b = new Scanner(System.in)) {
            System.out.println("Digite o caminho do arquivo: ");
            a = b.nextLine();
        }
        return a;
    }
    
}
