package MedHeap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Patient> patients;

    public Heap() {
        patients = new ArrayList<>();
    }

    public boolean isEmpty() {
        return patients.isEmpty();
    }

    public void insert(Patient patient) {
        patients.add(patient);
        heapifyUp(patients.size() - 1);
    }

    public Patient removeMin() {
        if (isEmpty()) return null;
        Patient minPatient = patients.get(0);
        patients.set(0, patients.get(patients.size() - 1));
        patients.remove(patients.size() - 1);
        heapifyDown(0);
        return minPatient;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (patients.get(index).getPriority() >= patients.get(parentIndex).getPriority()) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        int size = patients.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && patients.get(leftChild).getPriority() < patients.get(smallest).getPriority()) {
                smallest = leftChild;
            }
            if (rightChild < size && patients.get(rightChild).getPriority() < patients.get(smallest).getPriority()) {
                smallest = rightChild;
            }
            if (smallest == index) break;

            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int index1, int index2) {
        Patient temp = patients.get(index1);
        patients.set(index1, patients.get(index2));
        patients.set(index2, temp);
    }

    public String getNextPatient() {
        if (isEmpty()) return "Não há paciente para ser atendido.";
        return removeMin().getTicket();
    }

    public String showHeap() {
        if (isEmpty()) return "ED vazia!";
        StringBuilder sb = new StringBuilder("Pacientes na fila: ");
        for (Patient patient : patients) {
            sb.append(patient.getTicket()).append(" ");
        }
        return sb.toString();
    }
}
