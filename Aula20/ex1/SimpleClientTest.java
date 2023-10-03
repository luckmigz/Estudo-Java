package Aula20.ex1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class SimpleClientTest {
    private static Socket client; 
    public static void main(String[] args){
        try {
            String msg; 
            clientInit();
            System.out.println("Mensagens para o servidor");
            do {
                msg = JOptionPane.showInputDialog("Digite a mensagem( ou <sair> para encerrar)");
                
                if(!msg.equalsIgnoreCase("sair")){
                    System.out.println(msg);
                    sendMsg(msg);
                }





            } while (!msg.equalsIgnoreCase("sair"));
        } catch (IOException e) {
            System.err.println("Falha de comunicação" + e.getMessage());
        }
    }
    
    private static void clientInit() throws UnknownHostException, IOException{
        client = new Socket(SimpleClientServer.adress, SimpleClientServer.port);
        System.out.println("Cliente: " + SimpleClientServer.adress + ":" + SimpleClientServer.port);

    }
    private static void sendMsg(String msg) throws IOException {
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println(msg);
        
    }


}
