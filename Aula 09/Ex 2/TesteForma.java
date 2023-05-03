public class TesteForma {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        Triangle triangle  = new Triangle(2,2);
        Square square = new Square(2);
        Sphere sphere = new Sphere(2);
        Cube cube = new Cube(2,2);
        Tetrahedron tetrahedron = new Tetrahedron(2);
        System.out.println(circle.calculaArea());
        System.out.println(circle.calculaPerimetro());
        System.out.println(triangle.calculaArea());
        System.out.println(triangle.calculaPerimetro());
        System.out.println(square.calculaArea());
        System.out.println(square.calculaPerimetro());
        System.out.println(sphere.calculaArea());
        System.out.println(sphere.calculaVolume());
        System.out.println(cube.calculaArea());
        System.out.println(cube.calculaVolume());
        System.out.println(tetrahedron.calculaArea());
        System.out.println(tetrahedron.calculaVolume());
    }
}
