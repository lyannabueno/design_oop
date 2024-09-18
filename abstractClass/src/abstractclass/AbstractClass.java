package abstractclass;

public class AbstractClass {

    // an abstract class should be created when you want to define a class hierarchy in which subclasses must be implemented in conformity with the superclass

    public static void main(String[] args) {
        GeometricFigure figure1 = new Circle(5.00);
        System.out.println(figure1.getArea());
        System.out.println(figure1.getPerimeter());

        GeometricFigure figure2 = new Rectangle(5.00, 10.00);
        System.out.println(figure2.getArea());
        System.out.println(figure2.getPerimeter());
    }
    
}
