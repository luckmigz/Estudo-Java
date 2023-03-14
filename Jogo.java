



public class Jogo {
    public String jogar(String j){
        adv b = new adv(); 
        String notice;
        int g = b.justo();
        int pPlayer, pAdv;
        pPlayer = pAdv = 0 ;
        notice = " ";
        switch(g){ 
            case 1:
            b.ganha(j);
            pAdv++;
            notice = " Você perdeu! ";
            break;
            case 2:
            b.perde(j);
            pPlayer++;
            notice = " Você Venceu! ";
            break;
            case 3:
            b.empata(j);
            notice = " Empate! ";
            break;
        }
        return notice; 
       
    }
}
