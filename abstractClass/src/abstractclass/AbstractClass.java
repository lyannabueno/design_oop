package abstractclass;

public class AbstractClass {

    // an abstract class should be created when you want to define a class hierarchy in which subclasses must be implemented in conformity with the superclass

    public static void main(String[] args) {
        GeometricFigure figure1 = new Circle(5.00);
        System.out.println("A área do círculo é de " + figure1.getArea());
        System.out.println("O perímetro do círculo é de " + figure1.getPerimeter());

        GeometricFigure figure2 = new Rectangle(5.00, 10.00);
        System.out.println("A área do retângulo é de " + figure2.getArea());
        System.out.println("O perímetro do retângulo é de " + figure2.getPerimeter());
        
        GeometricFigure figure3 = new Trapeze(5.00, 10.00, 15.00, 20.00, 25.00);
        System.out.println("A área do trapézio é de " + figure3.getArea());
        System.out.println("O perímetro do trapézio é de " + figure3.getPerimeter());
        
        GeometricFigure figure4 = new Triangle(5.00, 10.00, 15.00, 20.00);
        System.out.println("A área do triângulo é de " + figure4.getArea());
        System.out.println("O perímetro do triângulo é de " + figure4.getPerimeter());
    }
}
