import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Qual quantidade?");
        int quant = Integer.parseInt(sc.nextLine());
        System.out.println("Qual o preço?");
        double price = Double.parseDouble(sc.nextLine());
        Produto produto = new Produto(quant,price,nome);
        String msg;
        msg = "Nome: "+produto.getNome() + " Quantidade:  " + produto.getQuantidade() + " Preço " + produto.getPrice() + " R$";
        System.out.println(msg);
        System.out.println("Altere a quantidade de alunos");
        sc.close();
    }   
}
