import javax.swing.JFrame;

public class Logintest {
    public static void main(String[] args) {
        LoginScreen log = new LoginScreen();
        log.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        log.setSize( 325, 125 );
        log.setVisible(true);
        log.setResizable(false);
        System.out.println(log.getPassword());
        System.out.println(log.getUser()); 
    }
}
