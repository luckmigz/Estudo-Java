package Aula20.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public final static String adress = "127.0.0.1";
    public final static int port = 3334; 
 
    
    public static void main(String[] args) throws IOException {
        
        try{    
            
            ServerSocket server = new ServerSocket(port); 
            Socket client = server.accept();
            PrintStream out = new PrintStream(client.getOutputStream(), true); 
           
            Scanner in = new Scanner(new InputStreamReader(client.getInputStream()));
            String msg;
            while(in.hasNextLine()){
                msg = in.nextLine();
                System.out.println("Mensagem recebida: " + msg);
                out.println("Servidor: " + msg);
            }

            out.close();
            in.close();
            server.close();

        }catch(IOException e){
            System.err.println("Erro ao iniciar o servidor");
        }
        
    }
    
}
