package Client;

import java.io.IOException;

import java.io.PrintWriter;
import java.net.Socket;

import java.io.*;


public class ClientController {
    private ClientUI clientUI;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientController() {
        // Nenhuma referência circular aqui
    }

    public void setClientUI(ClientUI clientUI) {
        this.clientUI = clientUI;
    }

    public void connectToServer(String serverAddress, int serverPort) {
        try {
            socket = new Socket(serverAddress, serverPort);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            clientUI.displayMessage("Conectado ao servidor: " + serverAddress + ":" + serverPort);
            startMessageReceiver();
        } catch (IOException e) {
            clientUI.displayMessage("Erro ao conectar ao servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void startMessageReceiver() {
        new Thread(() -> {
            try {
                String inputMessage;
                while ((inputMessage = in.readLine()) != null) {
                    clientUI.displayMessage(inputMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeConnection();
            }
        }).start();
    }

    private void closeConnection() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
