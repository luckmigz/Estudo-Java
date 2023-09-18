package Aula16.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Login {
    private String username, password;
    private Scanner in;
    
    public Login(){
        this.password = "";
        this.username = "";
    }
    public Login(String username, String password){
        setPassword(password);
        setUsername(username);
    }

    public void setUsername(String user){
       this.username = user;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
    public String getPassword() {
        return password;
    }

    public void loginTest(String file){
        try {
            in = new Scanner(new File(file));
            while(in.hasNext()){
            //String user = in.next("%s : %s");
                if(in.nextLine().equals(username)){
                    if(in.nextLine().equals(password)){
                        System.out.println(username+ ": " + password);
                    }else{
                        System.out.println("erro:1 " + password);
                    }
                }else{
                    System.out.println("erro:2" + username);
                }
            }   
        } catch (FileNotFoundException e) {
            System.out.println("Aquivo não encontrado");
        }
        
    
    }
}
