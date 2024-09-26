package MedHeap;

import javax.swing.*;

public class Main {
    private static Heap heap;
    private static int[] counters = {0, 0, 0, 0}; // Contadores para cada prioridade

    public static void main(String[] args) {
        heap = new Heap();
        startConsultation();

        while (true) {
            String[] options = {"PRIORIDADE 1", "PRIORIDADE 2", "PRIORIDADE 3", "PRIORIDADE 4", "PRÓXIMO", "INICIAR"};
            String choice = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Consultório Médico", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == null) break; // Se o usuário cancelar

            switch (choice) {
                case "INICIAR":
                    startConsultation();
                    break;
                case "PRIORIDADE 1":
                    addPatient(1);
                    break;
                case "PRIORIDADE 2":
                    addPatient(2);
                    break;
                case "PRIORIDADE 3":
                    addPatient(3);
                    break;
                case "PRIORIDADE 4":
                    addPatient(4);
                    break;
                case "PRÓXIMO":
                    String nextPatient = heap.getNextPatient();
                    JOptionPane.showMessageDialog(null, nextPatient);
                    break;
            }
        }
    }

    private static void startConsultation() {
        heap = new Heap();
        counters = new int[]{0, 0, 0, 0}; // Reinicia os contadores
        JOptionPane.showMessageDialog(null, "ED vazia!");
    }

    private static void addPatient(int priority) {
        counters[priority - 1]++;
        String name = JOptionPane.showInputDialog("Digite o nome do paciente:");
        Patient patient = new Patient(name, priority, counters[priority - 1]);
        heap.insert(patient);
        JOptionPane.showMessageDialog(null, "Senha do paciente: " + patient.getTicket());
    }
}
