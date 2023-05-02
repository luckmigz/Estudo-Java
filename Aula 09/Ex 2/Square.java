
public class Square extends TwoDimensionalShape {
    private double altura; 
    public double area;
    public Square(double base, double altura) {
        super(base);
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcula(){
        area = super.getBase()*altura;
        return area;
    }
}
