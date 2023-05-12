package Aula10.Ex4;

public class Teste2 {
    public static void main(String[] args) {
        Comissionado comissionado = new Comissionado(2000,500,"Joao ", "de Melo","12345678-10");        
        Desempregado desempregado = new Desempregado(2000,"Ruan","Lopes","0123456789-11");
        Horista horista = new Horista("Fernado", "Pessoa", "24681012-10",20,40*4);
        Mensalista mensalista = new Mensalista(2000,"Bruno","Wyane","343455676-66");
        Tarefeiro tarefeiro = new Tarefeiro("Carlos", "Kent", "00000000000", 10,250);
        Vendedor vendedor = new Vendedor("Pedro","Parker","01010101010-01",300,100);
        System.out.println(comissionado.dados());
        System.out.println("----------------------------------------------------------------");
        System.out.println(horista.dados());
        System.out.println("----------------------------------------------------------------");
        System.out.println(mensalista.dados());
        System.out.println("----------------------------------------------------------------");
        System.out.println(tarefeiro.dados());
        System.out.println("----------------------------------------------------------------");
        System.out.println(vendedor.dados());
        System.out.println("----------------------------------------------------------------");
        System.out.println(desempregado.dados());
        System.out.println("----------------------------------------------------------------");
    }
}
