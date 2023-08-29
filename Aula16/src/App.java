import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileEditor file = new FileEditor();
        Login login = new Login();
        Scanner in = new Scanner(System.in);
        
        login.setUsername(in.nextLine());
        login.setPassword(in.nextLine());
        login.loginTest("a.txt");
       
        file.closeFile();
    }
}
