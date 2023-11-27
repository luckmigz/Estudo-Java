package Server;

public class ServerController {
    private NetworkService networkService;
    private ServerView serverView;

    public ServerController(NetworkService networkService, ServerView serverView) {
        this.networkService = networkService;
        this.serverView = serverView; // Verifique se serverView está sendo passado corretamente
        initialize();
    }

    private void initialize() {
        if (serverView != null) {
            serverView.setVisible(true);
        } else {
            System.out.println("serverView is null");
        }
        networkService.setServerView(serverView);
        networkService.startServer();
    }
}
