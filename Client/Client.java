package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


import Server.NetworkService;

public class Client implements Runnable {
    private final Socket socket;
    private final NetworkService networkService;
    private PrintWriter out;

    public Client(Socket socket, NetworkService networkService) {
        this.socket = socket;
        this.networkService = networkService;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                networkService.broadcastMessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}