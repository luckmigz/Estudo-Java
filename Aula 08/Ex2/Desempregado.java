

public class Desempregado  extends PessoaFisica{
    private double seguroDesemprgo;
    
    public Desempregado(){
        this.seguroDesemprgo = 0.0;
    }
    public Desempregado(double seguroDesemprgo,String nome, String sobrenome, String cpf ){
        super(nome,cpf,sobrenome);
        this.seguroDesemprgo = seguroDesemprgo;
    }
    public void setSeguroDesemprgo(double seguroDesemprgo){
        this.seguroDesemprgo = seguroDesemprgo;
    }
    public double getSeguroDesemprego(){
        return seguroDesemprgo;
    }
    public String dados(){
        String a = super.dados() + " Status: Desempregado" ;
        return a;
    }
}
