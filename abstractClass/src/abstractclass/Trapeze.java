package abstractclass;

public class Trapeze extends GeometricFigure {
    private double largerBase, smallerBase, height, rightSide, leftSide;

    public Trapeze(double largerBase, double smallerBase, double height, double rightSide, double leftSide) {
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
        this.height = height;
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    public double getArea() {
        return ((largerBase + smallerBase) * height) / 2;
    }

    public double getPerimeter() {
        return largerBase + smallerBase + leftSide + rightSide;
    }
}
