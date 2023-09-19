package P3.Crypto;

import java.io.*;
import java.util.*;
import java.lang.SecurityException;

public class FileEditor {
    private Formatter out;
    private Scanner in;
    private String msg;
    private List<String> msgList = new ArrayList<>();

    public void createFile(String filename){
        try {
            out = new Formatter(filename);
        }catch(SecurityException |FileNotFoundException e){
            System.err.println("Erro ao criar ou ao acessar o arquivo:" + filename);
            System.exit(1);
        }
    }
    public void readFile(){
        try {
            in = new Scanner(new File("Aula17","Mensagem.txt"));

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        while(in.hasNext()){
            String a;
            try{ 
                a = in.nextLine();
                msgList.add(a);
                
            }catch(FormatterClosedException formatterClosedException){ 
                    System.err.println("Erro ao ler o arquivo.");
            }
        }
    }
    public String getMsg(){
        msg = msgList.toString();
        return msg;
    }
    public void setMsg(String mesagem){
        msg = mesagem;
    }
    public void writeFile(String msg){
        out.format("%s \n",msg);
    }
    public void closeFile(){
        if(out != null){
            out.close();
            in.close();
        }
    }  
   
}
