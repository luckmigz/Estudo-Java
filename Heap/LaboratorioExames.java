import java.util.PriorityQueue;
import java.util.Queue;


public class LaboratorioExames {

    public static void main(String[] args) {
        Queue<Paciente> filaPrioridade0 = new PriorityQueue<>((a, b) -> a.idade - b.idade);
        Queue<Paciente> filaPrioridade1 = new PriorityQueue<>((a, b) -> a.idade - b.idade);
        Queue<Paciente> filaPrioridade2 = new PriorityQueue<>((a, b) -> a.idade - b.idade);
        Queue<Paciente> filaPrioridade3 = new PriorityQueue<>((a, b) -> a.idade - b.idade);

        // Adicionar pacientes às filas
        adicionarPaciente(filaPrioridade0, new Paciente("Paciente 1", 85, 0));
        adicionarPaciente(filaPrioridade1, new Paciente("Paciente 2", 70, 1));
        adicionarPaciente(filaPrioridade2, new Paciente("Paciente 3", 28, 2));
        adicionarPaciente(filaPrioridade3, new Paciente("Paciente 4", 45, 3));
        adicionarPaciente(filaPrioridade1, new Paciente("Paciente 5", 65, 1));
        adicionarPaciente(filaPrioridade3, new Paciente("Paciente 6", 35, 3));

        // Atender pacientes em ordem de prioridade
        atenderPacientes(filaPrioridade0);
        atenderPacientes(filaPrioridade1);
        atenderPacientes(filaPrioridade2);
        atenderPacientes(filaPrioridade3);
    }

    private static void adicionarPaciente(Queue<Paciente> fila, Paciente paciente) {
        fila.offer(paciente);
        System.out.println(paciente.nome + " adicionado à fila " + paciente.prioridade);
    }

    private static void atenderPacientes(Queue<Paciente> fila) {
        System.out.println("\nAtendendo pacientes na fila:");
        while (!fila.isEmpty()) {
            Paciente paciente = fila.poll();
            System.out.println("Atendendo " + paciente.nome + " (Idade: " + paciente.idade + ")");
        }
    }
}
