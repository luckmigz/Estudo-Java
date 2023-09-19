package P3.CheckSum;

import java.io.*;
import java.util.*;



public class LerArq {

    File file;
    Scanner in;
    
    public LerArq(String path, String filename){
        File arq = new File(path,filename);
        file = arq; 
    }
    

    public String filereader(){
        String data = "";
        try {
            
            in = new Scanner(file);
            while (in.hasNextLine()){
                data += in.nextLine(); 
                if (in.hasNextLine()){
                    data +="\n";
                }
             }
        } catch (FileNotFoundException se) {
            
            se.printStackTrace();
        }
        return data;
    }

}
