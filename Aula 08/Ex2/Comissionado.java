
public class Comissionado extends Mensalista{
    private double comissao;
    
    public Comissionado(double salario, double comissao, String nome ,String sobrenome,String cpf){
        super(salario,nome,sobrenome,cpf);
        this.comissao = comissao;
    }
    public double salario(){
        return super.salario()+comissao;
    }
}