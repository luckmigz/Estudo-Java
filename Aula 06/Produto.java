public class Produto {
    private String nome;
    private int quantidade;
    private double price;
    public Produto(int i, double d, String n){
        price =  d;
        nome = n;
        quantidade = i;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double d){
        price = d;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    
    
}