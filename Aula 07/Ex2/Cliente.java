package Ex2;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;
    public Cliente(String nome, String cpf, ContaCorrente conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }   
    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }
    public void setCpf(String cpf) {
        String a = cpf.substring(0,14);
        this.cpf = a;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ContaCorrente getConta() {
        return conta;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
}
