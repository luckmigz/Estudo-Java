package Client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Model {
    private Socket client;

    public void startConnection(String address, int port) throws IOException {
        client = new Socket(address, port);
    }

    public void sendMessage(String msg) throws IOException {
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println(msg);
        out.flush();
    }
}
