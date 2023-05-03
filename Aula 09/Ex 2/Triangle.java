
public class Triangle extends TwoDimensionalShape {
    private double area, altura;
    public Triangle(double base, double altura) {
        super(base);
        this.altura = altura;
    }
    public double calculaArea(){
        area = (super.getBase() * altura) / 2;
        return area;
    }
    public double calculaPerimetro(){
        double perimetro, ladoc; 
        ladoc = Math.sqrt(Math.pow(altura,2) + Math.pow(super.getBase()/2, 2));
        perimetro = 2*ladoc + super.getBase(); 
        return perimetro; 
    }
}
