
public class Triangle extends TwoDimensionalShape {
    private double area, altura;
    public Triangle(double base, double altura) {
        super(base);
        this.altura = altura;
    }
    public void calculoArea(){
        double base = super(base);
        area = (base * altura) / 2;
    }
    public void calculoPerimetro(){
        double base = super(base);
        double perimetro, ladoc; 
        ladoc = Math.sqrt(Math.pow(altura,2) + Math.pow(base/2, 2));
        perimetro = 2*ladoc + base; 
    }
}
