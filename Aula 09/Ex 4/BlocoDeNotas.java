import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BlocoDeNotas {
    private ArrayList<String> notas;
    public BlocoDeNotas(){
        notas = new ArrayList<String>();
    }
    public void addNotas(String nota) {
        notas.add(nota);
    }
    public boolean removeNotas(String nota) {
        int posicao = buscar(nota);
        if (posicao >= 0){
            notas.remove(posicao);
            return true;
        }
        else {
            return false;
        }
    }
    public int search(String nota){
        return buscar(nota);
    }
    private int buscar(String nota){
        for(int i=0; i<notas.size(); i++){
            String note = notas.get(i);
            if(note.equals(nota)){
                return i;
            }
        }
        return -1; 
    }
    public void noteList(){
        for(String nota:notas){
            JOptionPane.showMessageDialog(null, nota, "Notas salvas", 0);
        }
    }
    public void alterNota(String nota){
        removeNotas(nota);
        String note = JOptionPane.showInputDialog(null,"Digite a nova nota");
        addNotas(note);
    }
}
