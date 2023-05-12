package Aula10.Ex4;
public class Comissionado extends Mensalista{
    private double comissao;
    
    public Comissionado(double salario, double comissao, String nome ,String sobrenome,String cpf){
        super(salario,nome,sobrenome,cpf);
        this.comissao = comissao;
    }
    public double salario(){
        return super.salario()+comissao;
    }
    public String dados(){
        String a = super.dados() + " Comissionado" + "\nSalario: " + salario();
        return a;
    }
    public Comissionado(){
        
    }
}