package P3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arq {
    private Scanner in; 
    private Formatter out; 
    private List<String> msgList = new ArrayList<String>();

    public void create(String fileName){
        try {
            out = new Formatter(fileName);
        } catch (SecurityException |FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao criar ou ao acessar o arquivo:" + fileName);
            System.exit(1);
        }
    }


    public void read(String path, String fileName){
      
        try{
            in = new Scanner(new File(path,fileName));
            while(in.hasNext()){
                String a; 
                try {
                    a = in.nextLine();
                    msgList.add(a);

                } catch (FormatterClosedException e) {
                    JOptionPane.showMessageDialog(null,"Erro ao ler o arquivo.");
                    System.exit(1);
                }

            }  

        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado.");
            System.exit(1);
        }
        
    }

    public void write(String msg){
        out.format("%s \n", msg);
    }

    public void close(){
        if(out != null){
            out.close();
            in.close();
        }
    }

    public String getMsgS(){
        String msg = msgList.toString();
        return msg;
    }

    public List<String> getMsgList(){
        return msgList; 
    }
    
}
