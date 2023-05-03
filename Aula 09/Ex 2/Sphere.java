
public class Sphere extends ThreeDimensionalShape{

    public Sphere(double base) {
        super(base);
    }
    @Override
    public double getBase() {
        return super.getBase();
    }
    @Override
    public void setBase(double base) {
        super.setBase(base);
    }
    public double calculaVolume(){
        double volume = (4/3)*Math.PI*Math.pow(super.getBase(),3);
        return volume;
    }
    public double calculaArea(){
        double area = 4*Math.PI*Math.pow(super.getBase(),2);
        return area;
    }
}
