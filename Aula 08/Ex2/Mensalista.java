public class Mensalista extends Empregado{
    private double salario;
    
    public Mensalista(double salario,String nome ,String sobrenome,String cpf) {
        super(nome,sobrenome,cpf);
        this.salario = salario;
    }
    public double salario(){
        return this.salario;
    }
    public String dados(){
        String a = super.dados() + "\nClassificação: Mensalista" ;
        return a;
    }
}