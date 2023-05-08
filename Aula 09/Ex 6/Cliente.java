public class Cliente{
    private String nome, fone;
    private int id;
    public Cliente(String nome, String fone, int id) {
        this.nome = nome;
        this.fone = fone;
        this.id = id;
    }
    public String getFone() {
        return fone;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDados(){
        String a = "[ Nome: " + nome +", Fone: "+ fone +", ID: " + id + "]"; 
        return a;
    }
}