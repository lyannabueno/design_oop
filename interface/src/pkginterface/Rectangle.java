package pkginterface;

public class Rectangle implements GeometricFigure {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
