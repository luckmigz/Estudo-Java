
public class Circle extends TwoDimensionalShape{
    private double area,perimetro;
    public Circle(double base){
        super(base);
    }
    
    @Override
    public void setBase(double base) {
        
        super.setBase(base);
    }
    @Override
    public double getBase() {
        return super.getBase();
    }
    public double calculaArea(){
        area = Math.pow(super.getBase(),2)*Math.PI;
        return area;
    }
    public double calculaPerimetro(){
        perimetro = 2*super.getBase()*Math.PI;
        return perimetro;
    }
}
