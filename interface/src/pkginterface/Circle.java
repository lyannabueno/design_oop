package pkginterface;

public class Circle implements GeometricFigure {
    public final double PI = 3.14159;
    private double raio;
    
    public Circle(double raio){
        this.raio = raio;
    }
    
    public double getArea(){
        return PI * raio * raio;
    }
    
    public double getPerimeter(){
        return 2 * PI * raio;
    }
}
