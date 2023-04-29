public class Tarefeiro extends Empregado{
    private int numTarefa;
    private double salario;

    public Tarefeiro(String nome ,String sobrenome,String cpf, int numTarefa, double salario){
        super(nome ,sobrenome,cpf);
        this.numTarefa = numTarefa;
        this.salario = salario;

    }
    public void setNumTarefa(int numTarefa){
        this.numTarefa = numTarefa;
    }
    public int getNumTarefa(){
        return numTarefa;
    }
    public double salario(){
        double sal = salario*numTarefa;
        return sal;
    }
    public String dados(){
        String a = super.dados() + "\nClassificação: Tarefeiro" + "\nSalario: " + salario();
        return a;
    }
}   
