import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Deposito {
    private ArrayList<Caixa> lista;
   
    public Deposito(){
        lista = new ArrayList<Caixa>();
    }
    public int buscar(String dono){
        for(int i=0; i<lista.size(); i++){
            Caixa caixa = lista.get(i);
            String donoBox = caixa.getDono();
            if(dono.equals(donoBox)){
                return i;
            }
        }
        return -1; 
    }
    public void addCaixa(Caixa caixa) {
        lista.add(caixa);
    }
    public void addCaixa(String corredor, int posicao, double peso, String dono){
        Caixa caixa = new Caixa(corredor, posicao, peso, dono);
        caixa.setCorredor(corredor);
        caixa.setDono(dono);
        caixa.setPeso(peso);
        caixa.setPosicao(posicao);
        lista.add(caixa);
    }
    public boolean removeCaixa(String dono) {
        int posicao = buscar(dono);
        if(posicao >= 0){
            lista.remove(posicao);
            return true;
        }else{
            return false;
        }
    }
    public void alterbox(String dono){
        int lugar = buscar(dono);
        Caixa caixa = new Caixa();
        if(lugar >= 0 ){
            int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova posição"));
            caixa.setPosicao(posicao);
            String corredor = JOptionPane.showInputDialog(null,"Digite o novo corredor");
            caixa.setCorredor(corredor);
        }
    }
    public String listaPeso(){
        Caixa caixa = new Caixa();
        double peso = caixa.getPeso();
        String a = " ";
        if(peso > 10.0){
            for(int i= 0 ;i<5; i++){
                a = " [" + caixa.getDono() + " " + caixa.getCorredor() + " " + caixa.getPosicao() + " " + caixa.getPeso() + "]\n" + a;
            }
            return a;
        }else{
            return "Não tem caixas";
        }
    }

}
