package P3;

public class Main {
   
    public static void main(String[] args){
        Arq arq = new Arq();
        arq.read("P3","test.txt");
        
        Login login = new Login();
        System.out.println(login.validate("login3", "senha3", arq.getMsgList()));
    }

}
