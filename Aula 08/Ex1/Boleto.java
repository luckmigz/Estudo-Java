
public class Boleto extends Pagamento{
   private String numeroDoBoleto; 
   private int dia,mes,ano;

   public Boleto(String numero, int d, int m, int a) {
        this.numeroDoBoleto = numero;
        this.dia = d;
        this.mes = m;
        this.ano = a;
   }
  
   public String getNumeroDoBoleto() {
        return numeroDoBoleto;
   }
   public void setNumeroDoBoleto(String numeroDoBoleto) {
        this.numeroDoBoleto = numeroDoBoleto;
   }
   public int getDia() {
        return dia;
   }
   public void setDia(int dia) {
        this.dia = dia;
   } 
   public int getMes() {
        return mes;
   }
   public void setMes(int mes) {
        this.mes = mes;
   }
   public int getAno() {
        return ano;
   }
   public void setAno(int ano) {
        this.ano = ano;
   }

   public String pago(){
    String a = pago() + "usando o Boleto que vence" + dia + "/" + mes + "/"+ ano;
    return a;
}
   
}
