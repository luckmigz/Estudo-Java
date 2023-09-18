package P3;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Login {
    private Arq arq = new Arq();
    private Formatter out;
    private Scanner in; 
    private String username; 
    private String password;
    
    
    public List<String> breaker(List<String> list){
        List<String> parts = new ArrayList<String>();

        for(String str: list){
            String regex = "\\s:\\s"; 
            String[] parta = str.split(regex);
            for(String word: parta){
                
                parts.add(word);
            }
        }
        return parts; 
        
    }

    public boolean validate(String user, String password, List<String> list){
        List<String> parts = new ArrayList<String>();
        parts = breaker(list);
        boolean result = false;

        for(String login:parts) {
            if(login.equals(user)){
                System.out.println("Login: " + login);
                if(login.equals(password)){
                    System.out.println("Password "+login);
                    result = true;
                }else{
                    System.out.println("Invalid login "+ login);
                    result = false;
                }
            }else{
                System.out.println("Invalid login1 "+ login);
                result = false;
            }
            return result;
        }
        return result;
    }

}
