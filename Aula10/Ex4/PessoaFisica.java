package Aula10.Ex4;


public class PessoaFisica{
    private String nome ,sobrenome, cpf;
    
    public PessoaFisica(){
       
    }
    public PessoaFisica(String nome ,String sobrenome,String cpf){
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public String dados(){
        String a = "Nome: " + nome + "\nSobrenome: "+ sobrenome + "\nCPF:" + cpf;
        return a;
    }
}
