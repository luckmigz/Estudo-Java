package Ex2;

public class Agencia {
    private String nome;
    private int num;
    private int digito;
    public Agencia(String nome, int num, int digito) {
        this.nome = nome;
        this.num = num;
        this.digito = digito;
    }
    public String getNome() {
        return nome;
    }
    public int getDigito() {
        return digito;
    }
    public int getNum() {
        return num;
    }
    public void setAgencia(int digito, String nome , int num) {
        this.digito = digito;
        this.num = num;
        this.nome = nome;
    }
}
