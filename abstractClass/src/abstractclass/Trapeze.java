package abstractclass;

public class Trapeze extends GeometricFigure {
    private double baseMaior, baseMenor, altura, direita, esquerda;
    
    public Trapeze(double baseMaior, double baseMenor, double altura, double direita, double esquerda) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.direita = direita;
        this.esquerda = esquerda;
    }
    
    public double getArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
    
    public double getPerimeter() {
        return baseMaior + baseMenor + esquerda + direita;
    }
}
