package Client;

public class ClientMain {
    public static void main(String[] args) {
        ClientUI clientUI = new ClientUI();
        ClientController clientController = new ClientController();

        clientUI.setClientController(clientController);
        clientController.setClientUI(clientUI);

        clientUI.setVisible(true);
        clientController.connectToServer("127.0.0.1", 3334); // Altere o endereço e a porta conforme necessário
    }
}
