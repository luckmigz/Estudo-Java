package Heap.Medico;

import java.util.PriorityQueue;

public class MedicalQueue {
    private PriorityQueue<Patient>[] queues;

    public MedicalQueue() {
        queues = new PriorityQueue[10];
        for (int i = 0; i < 10; i++) {
            queues[i] = new PriorityQueue<>((a, b) -> b.getAge() - a.getAge());
        }
    }

    public void addPatientToQueue(Patient patient) {
        int priority = determinePriority(patient);
        queues[priority].add(patient);
    }

    private int determinePriority(Patient patient) {
        if (patient.getAge() >= 80) {
            return 0;
        } else if (patient.getAge() >= 60) {
            return 1; 
        } else if (patient.isPregnantOrPostpartum()) {
            return 2; 
        } else {
            return 3; 
        }
    }

    public String processPatients() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < queues.length; i++) {
            while (!queues[i].isEmpty()) {
                Patient nextPatient = queues[i].poll();
                result.append("Atendendo paciente: ")
                        .append(nextPatient.getName())
                        .append(", Idade: ")
                        .append(nextPatient.getAge())
                        .append(", Prioridade: ")
                        .append(priority(nextPatient))
                        .append("\n");
            }
        }
        return result.toString();
    }

    private String priority(Patient patient) {
        if( determinePriority(patient) != 3 ){
            return "sim";
        }else{
            return "não";
        }
    }
    
}


