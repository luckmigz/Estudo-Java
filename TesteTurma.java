import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o nome da classe");
        String nome = sc.nextLine();
        System.out.println("De qual curso?");
        String curso = sc.nextLine();
        System.out.println("Qual serie?");
        int serie = Integer.parseInt(sc.nextLine());
        System.out.println("Quantos alunos?");
        int quantAlunos = Integer.parseInt(sc.nextLine());
        Turma turma = new Turma(nome, serie, quantAlunos, curso);
        String msg;
        msg = "Nome: "+turma.getNome() + "\nCurso: " + turma.getCurso() + "\nSerie: " + turma.getSerie() + "\nQuantidade de alunos: " + turma.getQuantAlunos();
        System.out.println(msg);
        System.out.println("Altere a quantidade de alunos");
        quantAlunos = Integer.parseInt(sc.nextLine());
        turma.setQuantAlunos(quantAlunos);
        msg = "Nome: "+turma.getNome() + "\nCurso: " + turma.getCurso() + "\nSerie: " + turma.getSerie() + "\nQuantidade de alunos: " + turma.getQuantAlunos();
        System.out.println(msg);
        sc.close();
    }
}
