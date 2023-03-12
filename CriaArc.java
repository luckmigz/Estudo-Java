import java.io.*;

public class CriaArc {
    public static void criar(){
        File file = new File("C:\\Users\\Usuario\\Desktop\\Nova pasta (2)\\arquivo.txt");
        try{
            boolean v = file.createNewFile();
            if(v){
                System.out.println("Aquivo criado");
            }
            else {
                System.out.println("O aquivo ja exite");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    public static void escrever(String h){
        try { 
            FileWriter output = new FileWriter("C:\\Users\\Usuario\\Desktop\\Nova pasta (2)\\arquivo.txt", true);
            output.write(h);
            output.close();

        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
