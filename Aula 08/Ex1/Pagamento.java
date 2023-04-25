
public class Pagamento{
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;
    public Pagamento(String nome, String cpf, double valor){
        this.nomeDoPagador = nome;
        this.cpf = cpf;
        this.valorASerPago = valor;
    }
    public String getNomeDoPagador(){
        return this.nomeDoPagador;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getValorASerPago(){
        return this.valorASerPago;
    }
    public void setValorASerPago(double valor){
        this.valorASerPago = valor;
    }
    public void setNomeDoPagador(String nome){
        this.nomeDoPagador = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String pago(){
        String a = String.format("O Cliente %d pagou a conta no valor de %.2f R$",nomeDoPagador,valorASerPago);
        return a;
    }
}
