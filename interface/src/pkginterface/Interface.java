package pkginterface;

public class Interface {

    // define a set of methods that must be implemented by a class
    
    public static void main(String[] args) {
        GeometricFigure figure1 = new Circle(5.00);
        System.out.println("The area of the circle is " + figure1.getArea());
        System.out.println("The perimeter of the circle is " + figure1.getPerimeter());

        GeometricFigure figure2 = new Rectangle(5.00, 10.00);
        System.out.println("The area of the rectangle is " + figure2.getArea());
        System.out.println("The perimeter of the rectangle is " + figure2.getPerimeter());

        GeometricFigure figure3 = new Trapeze(5.00, 10.00, 15.00, 20.00, 25.00);
        System.out.println("The area of the trapezoid is " + figure3.getArea());
        System.out.println("The perimeter of the trapezoid is " + figure3.getPerimeter());

        GeometricFigure figure4 = new Triangle(5.00, 10.00, 15.00, 20.00);
        System.out.println("The area of the triangle is " + figure4.getArea());
        System.out.println("The perimeter of the triangle is " + figure4.getPerimeter());
    }
    
}
