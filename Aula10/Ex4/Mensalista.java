package Aula10.Ex4;

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
    public Mensalista(){
        super();
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}