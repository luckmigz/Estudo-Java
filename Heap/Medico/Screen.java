package Heap.Medico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen extends JFrame{
    private JTextArea displayArea;
    private MedicalQueue medicalQueue;

    public Screen() {
        medicalQueue = new MedicalQueue();

        

        setTitle("Fila Medica");
        setLayout(new BorderLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JButton addPatientButton = new JButton("Adicionar Paciente");
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPatient();
            }
        });

        JButton processPatientsButton = new JButton("Limpar Pacientes");
        processPatientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPatients();
            }
        });

        inputPanel.add(addPatientButton);
        inputPanel.add(processPatientsButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        setVisible(true);
    }

    private void addPatient() {
        String name = JOptionPane.showInputDialog("Nome: ");
        if (name == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escreva um nome valido", "Nome Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        int age;
        while (true) {
            String ageStr = JOptionPane.showInputDialog("Idade: ");
            if (ageStr == null) {
               
                return;
            }
    
            try {
                age = Integer.parseInt(ageStr);
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Escreva uma idade valida", "Invalid Age", JOptionPane.ERROR_MESSAGE);
            }
        }
    
        int option = JOptionPane.showConfirmDialog(null, "A paciente está gravida ou de pós-parto?", "Pregnancy Status", JOptionPane.YES_NO_OPTION);
        boolean isPregnantOrPostpartum = (option == JOptionPane.YES_OPTION);
        
        medicalQueue.addPatientToQueue(new Patient(name, age, isPregnantOrPostpartum));
        displayPatients(); 
    }

    private void displayPatients() {
       
        displayArea.setText(medicalQueue.processPatients());
    }

}
