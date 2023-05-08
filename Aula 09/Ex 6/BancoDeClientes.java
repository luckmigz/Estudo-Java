import java.util.ArrayList; 
import javax.swing.JOptionPane;

public class BancoDeClientes{
    private ArrayList<Cliente> clientes;
    private Cliente client;
    public BancoDeClientes(){
        clientes = new ArrayList<Cliente>();
    }
    private int buscar(String nome){
        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            String nomeCliente = cliente.getNome();
            if(nome.equals(nomeCliente)){
                return i;
            }
        }
        return -1;
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public boolean removeCliente(String nome){
        int posicao = buscar(nome);
        if(posicao >= 0){
            clientes.remove(posicao);
            return true;
        }else{
            return false;
        }
    }
    public void alterarCliente(String nome){
        int posicao = buscar(nome), n;
        Object[] opitions = {"Alterar nome", "Alterar fone", "Alterar id"};
        if(posicao >= 0){
            n = JOptionPane.showOptionDialog(null,"Selecione uma opção","Menu",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opitions,null);   
            switch(n){
                case 0:
                    String name = JOptionPane.showInputDialog(null,"Digite o novo nome: ");
                    client.setNome(name);
                break;
                case 1:
                    String fone = JOptionPane.showInputDialog(null,"Digite o novo fone: ");
                    client.setFone(fone);
                break;
                case 2:
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o novo id: "));
                    client.setId(id); 
                break;
            }
        }
    }
    public void clientList(){
        for(Cliente cliente:clientes){
            JOptionPane.showMessageDialog(null, cliente.getDados(), "Clientes", 0);
        }
    }
    public String showClient(String nome){
        int posicao = buscar(nome);
        if(posicao >= 0){
            String a = client.getNome() + ", " + client.getFone() + " " + client.getId();
            return a;
            
        }else{
            return "Cliente não encontrado";
        }
    }
}