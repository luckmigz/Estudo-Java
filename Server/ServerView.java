package Server;

import javax.swing.*;
import java.awt.*;


public class ServerView extends JFrame {
    private JTextArea clientListTextArea;
    private JTextArea messageTextArea;
    private NetworkService networkService;

    public ServerView(NetworkService networkService) {
        this.networkService = networkService;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Servidor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel(new BorderLayout());

        clientListTextArea = new JTextArea(15, 20);
        clientListTextArea.setEditable(false);
        JScrollPane clientListScrollPane = new JScrollPane(clientListTextArea);

        messageTextArea = new JTextArea(15, 40);
        messageTextArea.setEditable(false);
        JScrollPane messageScrollPane = new JScrollPane(messageTextArea);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, clientListScrollPane, messageScrollPane);
        panel.add(splitPane, BorderLayout.CENTER);

        add(panel);
        setLocationRelativeTo(null);
    }

    public void updateClientList(String clientInfo) {
        SwingUtilities.invokeLater(() -> {
            clientListTextArea.append(clientInfo + "\n");
            clientListTextArea.setCaretPosition(clientListTextArea.getDocument().getLength());
        });
    }

    public void displayMessage(String message) {
        SwingUtilities.invokeLater(() -> {
            messageTextArea.append(message + "\n");
            messageTextArea.setCaretPosition(messageTextArea.getDocument().getLength());
        });
    }
}


