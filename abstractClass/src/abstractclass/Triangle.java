package abstractclass;

public class Triangle extends GeometricFigure {
    private double base, altura, lado_esquerdo, lado_direito;
    
    public Triangle(double base, double altura, double lado_esquerdo, double lado_direito) {
        this.base = base;
        this.altura = altura;
        this.lado_direito = lado_direito;
        this.lado_esquerdo = lado_esquerdo;
    }
    
    public double getArea() {
        return (base * altura) / 2;
    }
    
    public double getPerimeter() {
        return base + lado_direito + lado_esquerdo;
    } 
}
