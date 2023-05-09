import javax.swing.JOptionPane;


public class Teste {
    public static void main(String[] args){
        Deposito deposito = new Deposito();
        Object[] opitions = {"Adiciona uma caixa", "Remova uma caixa", "Altere uma caixa"," Procura caixa" ,"Listar as caixas mais pesadas que 10.0", "Sair"};
        String dono, corredor;
        int posicao;
        double peso;
        int n = 0; 
        do{
            n = JOptionPane.showOptionDialog(null,"Selecione uma opção","Menu",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opitions,null);          
            switch(n){
                case 0: 
                dono = JOptionPane.showInputDialog(null,"Dono da caixa");
                corredor = JOptionPane.showInputDialog(null,"Corredor da caixa");
                posicao =Integer.parseInt(JOptionPane.showInputDialog(null,"Posição da caixa"));
                peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Peso da caixa"));
                deposito.addCaixa(corredor,posicao,peso,dono);
                n = 1;
                break;
                case 1: 
                dono = JOptionPane.showInputDialog(null,"Digite o dono da caixa a ser removida");
                deposito.removeCaixa(dono);
                n = 2;
                break;
                case 2: 
                dono = JOptionPane.showInputDialog(null,"Digite o dono da caixa a ser alterada");
                deposito.alterbox(dono);
                n = 3;
                break;
                case 3:
                dono = JOptionPane.showInputDialog(null,"Digite o dono da caixa a ser procurada");
                int a = deposito.buscar(dono);
                JOptionPane.showMessageDialog(null,"A posição da caixa é " + a );

                n = 4;
                break;
                case 4:
                deposito.listaPeso();
                n = 5;
                break;
                case 5:
                JOptionPane.showMessageDialog(null,"Saindo...");
                n = 0; 
                break;
            }   
        }while(n<6 && n > 0 );
    
    }
}
