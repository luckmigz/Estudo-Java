
public class FuncionarioAposentado extends Pessoa{
    private double salarioAposentadoria;

    public FuncionarioAposentado(String nome, int idade, double salarioAposentadoria){
      super(nome, idade);
      this.salarioAposentadoria = salarioAposentadoria;  
    }

}
