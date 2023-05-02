
public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    public Funcionario (String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public int categoria(){
        if(idade > 20){
            return 30;
        }else{
            return 10;
        }
    }
}
