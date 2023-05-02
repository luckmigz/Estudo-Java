
public class Cube extends ThreeDimensionalShape {
    private double areaBase;
    public Cube(double base, double areaBase) {
        super(base);
        this.areaBase = areaBase;
    }
    public double getAreaBase() {
        return areaBase;
    }
    
}
