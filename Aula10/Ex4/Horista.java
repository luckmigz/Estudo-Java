package Aula10.Ex4;


public class Horista extends Empregado{
    private int horasTrab;
    private double salario;

    public Horista(String nome, String sobrenome, String cpf,double salario, int horasTrab) {
        super(nome, sobrenome, cpf);
        this.horasTrab = horasTrab;
        this.salario = salario;
    }
    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    public int getHorasTrab() { 
        return horasTrab;
    }
    public double salario(){
        salario = salario*horasTrab;
        return salario;
    }
    public String dados(){
        String a = super.dados() + "\nClassificação: Horista" + "\nSalario: " + salario();
        return a;
    }
}