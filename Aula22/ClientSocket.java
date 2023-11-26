package Aula22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientSocket {
    private final Socket socket;
    private final BufferedReader in; 
    private final PrintWriter out; 

    public ClientSocket(final Socket socket) throws IOException {
        this.socket = socket;
        System.out.println("Cliente: " + socket.getRemoteSocketAddress() + " se conectou");
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(),true);
    }

    public SocketAddress getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress();
    }

    public void close(){
        try{
            in.close();
            out.close();
            socket.close();
        }catch(IOException e){
            System.out.println("erro ao fechar o socket"+ e.getMessage());
        }
    }

    public String getMessage(){
        try{
            return in.readLine();
        }catch(IOException e){
            return null;
        }
    }

    public boolean sendMsg(String msg) {
        out.write(msg);
        return !out.checkError();
    }
}
