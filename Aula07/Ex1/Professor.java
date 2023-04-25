package Ex1;

public class Professor {
    private String nome;
    private int idade;
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String name){
        this.nome = name;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade= idade;
    }
    public String getDados(){
        return "[Nome = "+nome+", Idade = "+idade+" ]";
    }
}
