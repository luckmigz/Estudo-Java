import javax.swing.JOptionPane;

public class CadastroApp{
    public static void main(String[] args){
        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        String nome = ". ", fone = ". ";
        int id = 0 ;
        Cliente cliente = new Cliente(nome,fone,id);
        Object[] opitions = {"Insira um cliente", "Remova um cliente", "Altere um cliente", "Listar clientes","Dados do cliente", "Sair"};
        int n = 0; 
        do{
            n = JOptionPane.showOptionDialog(null,"Selecione uma opção","Menu",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opitions,null);          
            switch(n){
                case 0: 
                nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente");
                fone = JOptionPane.showInputDialog(null,"Digite o fone do cliente");
                id =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Id do cliente"));
                cliente.setNome(nome);
                cliente.setFone(fone);
                cliente.setId(id);
                bancoDeClientes.addCliente(cliente);
                n = 1;
                break;
                case 1: 
                nome = JOptionPane.showInputDialog(null,"Digite o cliente a ser removido");
                bancoDeClientes.removeCliente(nome);
                n = 2;
                break;
                case 2: 
                nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente a ser alterado");
                bancoDeClientes.alterarCliente(nome);
                n = 3;
                break;
                case 3:
                bancoDeClientes.clientList();
                n = 4;
                break;
                case 4:
                nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente a ser exibido");
                String dado = bancoDeClientes.showClient(nome);
                JOptionPane.showMessageDialog(null, dado , "Clientes", 0);
                break;
                case 5:
                JOptionPane.showMessageDialog(null,"Saindo...");
                n = 0; 
                break;
            }   
        }while(n<6 && n > 0 );
    }
}

