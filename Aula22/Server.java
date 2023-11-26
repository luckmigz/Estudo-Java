package Aula22;


import java.io.IOException;
import java.net.ServerSocket;




public class Server {
    public final static String adress = "127.0.0.1";
    public final static int port = 3334; 
    private ServerSocket serverSocket;
    
    public static void main(String[] args) throws IOException {
        
        try{    
            
            Server server = new Server();
            server.start();

        }catch(IOException e){
            System.err.println("Erro ao iniciar o servidor");
        }
        System.out.println("servidor finali");
    }
    public void start() throws IOException{
        serverSocket = new ServerSocket(port);
        System.out.println("Ouvindo porta:" + port);
        clientConnectionLoop();
    }
    private void clientConnectionLoop() throws IOException {
        System.out.println("Aguardando mensagem");
        do{
            ClientSocket clientSocket = new ClientSocket(serverSocket.accept());
            new Thread(() -> clientMesseageLoop(clientSocket)).start();
        }while(true);
    }
    public void clientMesseageLoop(ClientSocket clientSocket) {
        String msg; 
        try {
            while(( msg = clientSocket.getMessage()) != null )  {
                System.out.printf("Menssagem recebida do client %s: %s \n", clientSocket.getRemoteSocketAddress(), msg);
            }
        }finally {
            clientSocket.close();
        }     
    }
}
