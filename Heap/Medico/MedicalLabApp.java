package Heap.Medico;

public class MedicalLabApp {
    public static void main(String[] args) {
        MedicalQueue queue = new MedicalQueue();
        Screen screen = new Screen(); 
        // insersão de pacientes 
        queue.addPatientToQueue(new Patient("João", 85));
        queue.addPatientToQueue(new Patient("Fernanda", 55, false));
        queue.addPatientToQueue(new Patient("Daniel", 65));
        queue.addPatientToQueue(new Patient("Maria", 30, true));
        
     
       System.out.println(queue.processPatients()); 

       
    }
}
