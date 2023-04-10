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
    public void setAgencia(String nome , int num) {
        this.num = num;
        this.nome = nome;
    }
    public void setDigito() {
        int a = getNum();
        String s = Integer.toString(a);
        String n = s.substring(0, 1), m = s.substring(1,2) , l = s.substring(2,3), k = s.substring(3,4); 
        int b = Integer.parseInt(n), c = Integer.parseInt(m),d = Integer.parseInt(l), e = Integer.parseInt(k);
        int g = ((b*4) + (c*6) + (d*8) + (e*2))%11;
        if( g == 10){
            this.digito = 0;
        } else{
            this.digito = g;
        } 
    }
}
