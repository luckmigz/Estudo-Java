import java.util.Random;


public class adv{
    String nome;
    public int justo(){
        int a;
        Random rand = new Random();
        a = rand.nextInt(3);
        return a;
    }
    public  String ganha(String h){
        String play;
        play = " ";
        switch(h){
            case "Pedra":
            play = "Papel";
            
            case "Papel":
            play = "Tesoura";
            
            case "Tesoura": 
            play = "Pedra";
            
        }
        return play; 
    }
    public  String perde(String h){
        String play;
        play = " ";
        switch(h){
            case "Pedra":
            play = "Tesoura";
                   
            case "Papel":
            play = "Pedra";

            case "Tesoura": 
            play = "Papel";
        }
        return play; 
    }
    public  String empata(String h){
        String play;
        play = " ";
        switch(h){
            case "Pedra":
            play = "Pedra";
                   
            case "Papel":
            play = "Papel";

            case "Tesoura": 
            play = "Tesoura";
        }
        return play; 
    }
}
