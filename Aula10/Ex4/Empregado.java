package Aula10.Ex4;

public class Empregado extends PessoaFisica{

    public Empregado(String nome ,String sobrenome,String cpf){
        super(nome, sobrenome, cpf);        
    }
    public double salario(){
        return 0.0;
    }
    public String dados(){
        return super.dados() + "\nStatus: Empregado";
    }
    public Empregado(){
        
    }
}