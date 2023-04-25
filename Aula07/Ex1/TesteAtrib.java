package Ex1;
import java.util.Scanner;

public class TesteAtrib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual disciplina?");
        String dis = sc.nextLine();
        System.out.println("Qual a situação da disciplina?");
        boolean b = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Qual professor?");
        String nome = sc.nextLine();
        System.out.println("Qual idade ?");
        int id = Integer.parseInt(sc.nextLine());
        Professor prof = new Professor(nome, id);
        prof.setIdade(id);
        prof.setNome(nome);
        Disciplina disciplina = new Disciplina(dis,b);
        disciplina.setNome(dis);
        disciplina.setPratica(b);
        Atribucao atribucao = new Atribucao(prof, disciplina);
        atribucao.setDisciplina(disciplina);
        atribucao.setProfessor(prof);
        String a = atribucao.getDados();
        System.out.println(a);
        sc.close();
    }

}
