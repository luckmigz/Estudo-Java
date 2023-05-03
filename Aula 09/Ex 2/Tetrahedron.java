
public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(double base){
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
        double volume = (Math.pow(super.getBase(),3)*Math.sqrt(2))/12;
        return volume;
    }
    public double calculaArea(){
        double area = Math.sqrt(3)*Math.pow(super.getBase(),2);
        return area;
    }
}
