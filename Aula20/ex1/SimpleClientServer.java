package Aula20.ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClientServer {
    public final static String adress = "127.0.0.1";
    public final static int port = 3334; 

    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(port); 
            System.out.println("Servidor iniciado na porta" + port);

            Socket client = server.accept();

            System.out.println("IP client: " + client.getInetAddress().getHostAddress()+ 
            " conectado ao servidor");

            Scanner in = new Scanner(client.getInputStream());

            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            System.out.println("servidor finalizado");

            in.close();
            server.close();

        }catch(IOException e){
            System.err.println("Erro ao iniciar o servidor");
        }
    }
}
