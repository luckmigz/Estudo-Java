package P3;

import java.util.ArrayList;
import java.util.List;

public class Login {
    private int control; 
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

    public boolean validate(String user, String password, List<String> list) {
        List<String> parts = breaker(list);

        for (String login : parts) {
            if (login.equals(user)) {
                System.out.println("user pass");
                for(String pass: parts) {
                    if (pass.equals(password)) {
                        System.out.println("aaaa");
                        control = 0;
                        return true;
                    } else if(!pass.equals(password)) {
                        System.out.println(" errrrrr");
                        // Senha invalida
                        control = 1;
                        return false;
                    }
                } 
            }
        }
        // User invalido 
        control = -1; 
        return false;
    }
    public int getControl() {
        return control;
    }
}
