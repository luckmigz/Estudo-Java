

public class Horista extends Empregado{
    private int horasTrab;
    private double salario;

    public Horista(String nome, String sobrenome, String cpf,double salario, int horasTrab) {
        super(nome, sobrenome, cpf);
        this.horasTrab = horasTrab;
    }
    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    public int getHorasTrab() { 
        return horasTrab;
    }
    public double salario(){
        double sal = salario*horasTrab;
        return sal;
    }
}