package pkginterface;

public class Triangle implements GeometricFigure {
    private double base, height, leftSide, rightSide;

    public Triangle(double base, double height, double leftSide, double rightSide) {
        this.base = base;
        this.height = height;
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return base + rightSide + leftSide;
    }
}
