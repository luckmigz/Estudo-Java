
public class Cube extends ThreeDimensionalShape {
    private double areaBase;
    public Cube(double base, double areaBase) {
        super(base);
        this.areaBase = areaBase;
    }
    @Override
    public double getBase() {
        return super.getBase();
    }
    @Override
    public void setBase(double base) {
        super.setBase(base);
    }
    public double getSetAreaBase() {
        Square square = new Square(getBase());
        return square.calculaArea();
    }
    public double calculaVolume(){
        double volume = areaBase*super.getBase();
        return volume;
    }
    public double calculaArea(){
        Square square = new Square(getBase());
        double area = 6*square.calculaArea();
        return area;
    }

}
