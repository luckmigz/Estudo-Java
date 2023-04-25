package Ex2;

public class ContaCorrente {
    private int numero,digito;
    private Agencia agencia;
    private double saldo;
    public ContaCorrente(int numero,int digito,double saldo,Agencia agencia){
        this.agencia = agencia;
        this.digito = digito;
        this.numero = numero;
        this.saldo = saldo;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public int getDigito() {
        return digito;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public void setDigito() {
        int a = getNumero();
        String s = String.valueOf(a);
        String n = s.substring(0, 2), m = s.substring(2,3) , l = s.substring(3,4), k = s.substring(5,6); 
        int b = Integer.parseInt(n), c = Integer.parseInt(m),d = Integer.parseInt(l), e = Integer.parseInt(k);
        int g = ((b*4) + (c*6) + (d*8) + (e*2))%11;
        if( g == 10){
            this.digito = 0;
        } else{
            this.digito = g;
        } 
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo = saldo+valor;
    }
    public void sacar(double valor){
        this.saldo = saldo-valor;
    }
    public double consultar(){
        return saldo;
    }
    public String imprimir(double saldo){
        String s = "Conta: " + numero + " Digito: " + digito + "\nAgencia: " + agencia.getNum() + "Digito: " + agencia.getDigito()  + "\nSaldo: " + saldo;
        return s;
    }
}
