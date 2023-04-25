import java.util.Scanner;

public class TesteDisciplina {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a disciplina?");
        String nome = sc.nextLine();
        System.out.println("Quem é o professor");
        String prof = sc.nextLine();
        System.out.println("Qual o semestre?");
        int semestre = Integer.parseInt(sc.nextLine());
        System.out.println("Está sendo ofertada?(true|false)");
        boolean ofertada = Boolean.parseBoolean(sc.nextLine());
        Disciplina dis = new Disciplina(prof, semestre, ofertada, nome);
        String msg; 
        msg = "Nome: " + dis.getNome() + "\nProfessor:  " + dis.getProfessor() + "\nSemetre:  " + dis.getSemetre() + "\nDisponivel:  " + dis.getOferta();
        System.out.println(msg);
        sc.close();
    }
}
