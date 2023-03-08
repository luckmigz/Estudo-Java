import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class mat{
    public static void main(String[] args) throws FileNotFoundException{
        File arq = new File("C:\\Users\\19.00386-2\\Documents\\txt.txt");
        Scanner sc = new Scanner(arq);
        while( sc.hasNext()){
            System.out.print(sc.nextLine());
            System.out.println("");
        }
        sc.close();
        /*int x, y;
        String nome;
        Scanner sc = new Scanner(System.in); 
        System.out.print("insira x: ");
        x = sc.nextInt();
        System.out.print("\ninsira o seu nome: ");
        nome = sc.nextLine();
        System.out.print("\ninsira o y:");
        y = sc.nextInt();
        System.out.println(nome);*/
        
             
    }
}