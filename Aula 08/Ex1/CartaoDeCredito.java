
public class CartaoDeCredito extends Pagamento{
    private String numeroDoCartao;
    public CartaoDeCredito(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    public void setNumeroDoCarto(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    public String pago(){
        String a = pago() + "usando o Cartao de Credito";
        return a;
    }
}
