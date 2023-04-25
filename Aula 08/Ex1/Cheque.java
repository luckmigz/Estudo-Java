
public class Cheque extends Pagamento{
    private String numeroDoCheque;
    
    public Cheque(String numero,String nome, String cpf, double valor){
        super(nome, cpf,valor);
        this.numeroDoCheque = numero;
    }
    public String getNumeroDoCheque(){
        return this.numeroDoCheque;
    }
    public void setNumeroDoCheque(String numeroDoCheque){
        this.numeroDoCheque = numeroDoCheque;
    }
    public String pago(){
        String a = pago() + "usando o Cheque";
        return a;
    }
}
