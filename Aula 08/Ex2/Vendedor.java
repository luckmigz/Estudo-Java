public class Vendedor extends  Empregado {
    private int produtos;
    private double salario;

    public Vendedor(String nome ,String sobrenome,String cpf, double salario, int produtos){
        super(nome, sobrenome, cpf);
        this.salario = salario;
        this.produtos = produtos;
    }
    public void setProdutos(int produtos){
        this.produtos = produtos;
    }
    public int getProduto(){
        return produtos;
    }
    public double salario(){
        salario = salario*produtos;
        return salario;
    }
    
    public String dados(){
        String a = super.dados() + "\nClassificação: Vendedor" + "\nSalario: " + salario();
        return a;
    }
}
