import javax.swing.JOptionPane;
public class AppBloco {
    public static void main (String[] args){
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        Object[] opitions = {"Insira uma nota", "Remova uma nota", "Altere uma nota", "Listar as notas", "Sair"};
        String nota;
        int n = 0; 
        do{
            n = JOptionPane.showOptionDialog(null,"Selecione uma opção","Menu",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opitions,null);          
            switch(n){
                case 0: 
                nota = JOptionPane.showInputDialog(null,"Digite a nota");
                blocoDeNotas.addNotas(nota);
                n = 1;
                break;
                case 1: 
                nota = JOptionPane.showInputDialog(null,"Digite a nota a ser removida");
                blocoDeNotas.removeNotas(nota);
                n = 2;
                break;
                case 2: 
                nota = JOptionPane.showInputDialog(null,"Digite a nota a ser alterada");
                blocoDeNotas.alterNota(nota);
                n = 3;
                break;
                case 3:
                blocoDeNotas.noteList();
                n = 4;
                break;
                case 4:
                JOptionPane.showMessageDialog(null,"Saindo...");
                n = 0; 
                break;
            }   
        }while(n<5 && n > 0 );
    }
}
