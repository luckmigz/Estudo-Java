
public class Square extends TwoDimensionalShape {
    private double area,perimetro; 
    public Square(double base) {
        super(base);
    }
       public double calculaArea(){
        area = Math.pow(super.getBase(),2);
        return area;
    }
    public double calculaPerimetro(){
        perimetro = Math.pow(super.getBase(),2);
        return perimetro;
    }
}
