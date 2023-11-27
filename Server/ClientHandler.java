package Server;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket clientSocket;
    private final NetworkService networkService;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket, NetworkService networkService) {
        this.clientSocket = socket;
        this.networkService = networkService;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String inputMessage;
            while ((inputMessage = in.readLine()) != null) {
                networkService.broadcastMessage(inputMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void closeConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
            networkService.removeClient(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}