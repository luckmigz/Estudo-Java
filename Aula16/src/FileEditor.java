import java.io.*;
import java.util.*;
import java.lang.SecurityException;


public class FileEditor {
    private static Formatter out;
    private Scanner in; 

    public FileEditor(){

    }

    public static void createFile(String filename){
        try {
            out = new Formatter(filename);
        }catch(SecurityException |FileNotFoundException e){
            System.err.println("Erro ao criar ou ao acessar o arquivo:" + filename);
            System.exit(1);
        }
    }
    public void addUser(){
        Login log = new Login();
        in = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n\n", "Para o cadastro, digite o indicador de fim de arquivo", 
        "quando for notificado para colocar a informação", 
        "No UNIX/Linux/Mac OS digite <ctrl> d e pressione Enter",
        "No Windows digite <ctrl> z e pressione Enter ou <ctrl> e");

        System.out.printf("%s\n", "Digite o nome do aquivo");
        createFile(in.nextLine());
        
        System.out.printf("%s\n", "Digite o novo usuario e senha :");
        while(in.hasNext()){
           try{ 
            log.setUsername(in.nextLine());
            log.setPassword(in.nextLine());
            out.format("%s : %s", log.getUsername(), log.getPassword());
            }catch(FormatterClosedException formatterClosedException){ 
                System.err.println("Erro ao escrever no arquivo.");
            }catch(NoSuchElementException elementException){
                System.err.println("Entrada invalida. Tente novamente.");
                in.nextLine();
            }
            System.out.printf("%s\n", "Digite o novo usuario e senha :");

        }
    }
    public void closeFile(){
        if(out != null){
            out.close();
            in.close();
        }
    }  
    
}
