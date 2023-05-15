package Aula10.Ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Tela extends JFrame implements ActionListener {
    private JButton desempregado, tarefeiro, comissionado, horista, mensalista,vendedor,save, save2;
    private JLabel label, label2, label3, label4;
    private JTextField textField, textField2, textField3, textField4,textField5;
    private String text, text2, text3, text4,text5;
    private JPanel panel1, panel2,panel3; 
    private Comissionado a = new Comissionado();
    private Desempregado b = new Desempregado();
    private Horista c = new Horista();
    private Vendedor d = new Vendedor();
    private Tarefeiro h = new Tarefeiro();
    private Mensalista f = new Mensalista();
    public Tela(){
        super("Tela");
        desempregado = new JButton("Desempregado");
        tarefeiro = new JButton("Terefeiro");
        comissionado = new JButton("Comissionado");
        horista = new JButton("Horista");
        mensalista = new JButton("Mensalista");
        vendedor = new JButton("Vendedor");
        save = new JButton("Salvar");
        save2 = new JButton("Alterar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        label = new JLabel(text);
        label2 = new JLabel(text2);
        label3 = new JLabel(text3);
        label4 = new JLabel(text4);
        textField = new JTextField(text);
        textField2 = new JTextField(text2);
        textField3 = new JTextField(text3);
        textField4 = new JTextField(text4);
        textField4 = new JTextField(text5);
        panel1 = new JPanel(new GridLayout(5,1));
        panel2 = new JPanel(new GridLayout(5,1));
        panel3 = new JPanel(new GridLayout(5,1));
        container.setLayout(new BorderLayout());
        panel1.add(label);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel2.add(desempregado);
        panel2.add(tarefeiro);
        panel2.add(comissionado);
        panel2.add(horista);
        panel2.add(mensalista);
        container.add(panel1, BorderLayout.CENTER);
        container.add(panel2, BorderLayout.WEST);
        container.add(panel3, BorderLayout.EAST);
        
        // Action Listeners 
        desempregado.addActionListener(this);
        tarefeiro.addActionListener(this);
        comissionado.addActionListener(this);
        horista.addActionListener(this);
        mensalista.addActionListener(this);
        vendedor.addActionListener(this);
        save.addActionListener(this);
        save2.addActionListener(this);
        setSize(720,720);
        setVisible(true);
    }
   
   
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == desempregado){
            text  = "Nome " + b.getNome() +" "+  b.getSobrenome();
            text2 = "CPF " + b.getCpf();
            text3 =  "Seguro Desemprego " + b.getSeguroDesemprego() + "R$";
            text4 = " ";
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getDesmpre();
            }
           
        }
        if(e.getSource() == mensalista) { 
            text  = "Nome " + f.getNome() +" "+  b.getSobrenome();
            text2 = "CPF " + b.getCpf();
            text3 =  "Seguro Desemprego " + b.getSeguroDesemprego() + "R$";
            text4 = " ";
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getMens();
            }
           
        }
        if(e.getSource() == vendedor) {
            text  = "Nome:  " + d.getNome() +" "+  d.getSobrenome();
            text2 = "CPF: " + d.getCpf();
            text4 =  "Salario:  " + d.salario() + "R$";
            text3 = "Nº de produtos vendidos:  " + d.getProduto();
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getVend();
            }
  
        }
        if(e.getSource() == comissionado){
            text  = "Nome: " + a.getNome() +" "+  a.getSobrenome();
            text2 = "CPF: " + a.getCpf();
            text4 =  "Salario: " + a.salario() + "R$";
            text3 = "Comissão: " + a.getComi();
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getComi();
            }
           
        }
        if(e.getSource() == tarefeiro){
            text  = "Nome " + h.getNome() +" "+  h.getSobrenome();
            text2 = "CPF " + h.getCpf();
            text4 =  "Seguro Desemprego " + h.salario() + "R$";
            text3 = " Nº de Tarefas: " + h.getNumTarefa();
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getTar();
            }
       
        }
        if(e.getSource() == horista){
            text  = "Nome: " + c.getNome() +" "+  c.getSobrenome();
            text2 = "CPF: " + c.getCpf();
            text3 =  "Salario:  " + c.salario() + "R$";
            text4 = "Horas Trabalhadas: " + c.getHorasTrab();
            label.setText(text);
            label2.setText(text2);
            label3.setText(text3);
            label4.setText(text4);
            panel3.add(save);
            panel3.add(save2);
            if(e.getSource() == save){
                //save
                getHor();
            }
           
        }
        if(e.getSource() == save2){
            //alterar
            panel1.add(textField);
            panel1.add(textField2);
            panel1.add(textField3);
            panel1.add(textField4);
           
        }
        
    }
    private void getDesmpre() {
        updateDesempre();
        text  = "Nome " + b.getNome() +" "+  b.getSobrenome();
        text2 = "CPF " + b.getCpf();
        text3 =  "Seguro Desemprego " + b.getSeguroDesemprego() + "R$";
        text4 = " ";
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateDesempre(){
        b.setNome(textField.getText());
        b.setSobrenome(textField2.getText());
        b.setCpf(textField3.getText());
        b.setSeguroDesemprgo(Double.parseDouble(textField4.getText()));
    }
    private void getMens() {
        updateMens();
        text  = "Nome " + f.getNome() +" "+  f.getSobrenome();
        text2 = "CPF " + f.getCpf();
        text3 =  "Salario:  " + f.getSalario() + "R$";
        text4 = " ";
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateMens(){
        f.setNome(textField.getText());
        f.setSobrenome(textField2.getText());
        f.setCpf(textField3.getText());
        f.setSalario(Double.parseDouble(textField4.getText()));
    }
    private void getTar() {
        updateTar();
        text  = "Nome " + h.getNome() +" "+  h.getSobrenome();
        text2 = "CPF " + h.getCpf();
        text4 =  "Seguro Desemprego " + h.salario() + "R$";
        text3 = " Nº de Tarefas: " + h.getNumTarefa();
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateTar(){
        h.setNome(textField.getText());
        h.setSobrenome(textField2.getText());
        h.setCpf(textField3.getText());
        h.setNumTarefa(Integer.parseInt(textField4.getText()));
        h.setSalary(Double.parseDouble(textField5.getText()));
    }
    private void getComi() {
        updateComi();
        text  = "Nome: " + a.getNome() +" "+  a.getSobrenome();
        text2 = "CPF: " + a.getCpf();
        text4 =  "Salario: " + a.salario() + "R$";
        text3 = "Comissão: " + a.getComi();
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateComi(){
        a.setNome(textField.getText());
        a.setSobrenome(textField2.getText());
        a.setCpf(textField3.getText());
        a.setSalario(Double.parseDouble(textField5.getText()));
        a.setComi(Double.parseDouble(textField4.getText()));

    }
    private void getHor() {
        updateHor();
        text  = "Nome: " + c.getNome() +" "+  c.getSobrenome();
        text2 = "CPF: " + c.getCpf();
        text3 =  "Salario:  " + c.salario() + "R$";
        text4 = "Horas Trabalhadas: " + c.getHorasTrab();
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateHor(){
        c.setNome(textField.getText());
        c.setSobrenome(textField2.getText());
        c.setCpf(textField3.getText());
        c.setHorasTrab(Integer.parseInt(textField5.getText()));
        c.setSalary(Double.parseDouble(textField4.getText()));
    }
    private void getVend() {
        updateVend();
        text  = "Nome:  " + d.getNome() +" "+  d.getSobrenome();
        text2 = "CPF: " + d.getCpf();
        text4 =  "Salario:  " + d.salario() + "R$";
        text3 = "Nº de produtos vendidos:  " + d.getProduto();
        label.setText(text);
        label2.setText(text2);
        label3.setText(text3);
        label4.setText(text4);
        panel3.remove(save);
        panel3.remove(save2);
    }
    private void updateVend(){
        d.setNome(textField.getText());
        d.setSobrenome(textField2.getText());
        d.setCpf(textField3.getText());
        d.setProdutos(Integer.parseInt(textField4.getText()));
        d.setSalary(Double.parseDouble(textField5.getText()));

    }
    

}
