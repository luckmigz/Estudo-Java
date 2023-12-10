package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NetworkService {
    private final int port;
    private final List<ClientHandler> clients = new ArrayList<>();
    private ServerSocket serverSocket;
    private ServerView serverView;

    public NetworkService(int port) {
        this.port = port;
    }

    public void setServerView(ServerView serverView) {
        this.serverView = serverView;
    }

    public void startServer() {
        try {
            serverSocket = new ServerSocket(port);
            serverView.displayMessage("Servidor iniciado na porta: " + port);
            acceptClients();
        } catch (Exception e) {
            serverView.displayMessage("Erro ao iniciar o servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void acceptClients() {
        
        do{new Thread(() -> {
             {
                try {
                    Socket clientSocket = serverSocket.accept();
                    ClientHandler clientHandler = new ClientHandler(clientSocket, this);
                    clients.add(clientHandler);
                    new Thread(clientHandler).start();
                    serverView.displayMessage("Cliente conectado do IP: " + clientSocket.getInetAddress().getHostAddress());
                } catch (Exception e) {
                    serverView.displayMessage("Erro ao aceitar conexão do cliente: " + e.getMessage());
                    e.printStackTrace();
                }

            }
        }).start();}while (true);
    }

    public void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}
