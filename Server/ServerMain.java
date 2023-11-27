package Server;

public class ServerMain {
    
    public static void main(String[] args) {
        int port = 3334; // Porta do servidor

        NetworkService networkService = new NetworkService(port);
        ServerView serverView = new ServerView(networkService);
        ServerController serverController = new ServerController(networkService, serverView);

        javax.swing.SwingUtilities.invokeLater(() -> {
            serverView.setVisible(true);
        });

        networkService.setServerView(serverView);
        networkService.startServer();
    }
    
}
