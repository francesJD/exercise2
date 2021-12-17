public class Test {
    public static void main(String[] args) {

        // Test Circle
        Circle circle1 = new Circle(5.5);
        circle1.display();
        Circle circle2 = new Circle(10);
        circle2.display();
        System.out.println();

        // Test Rectangle
        Rectangle rectangle1 = new Rectangle(1,2);
        rectangle1.display();
        Rectangle rectangle2 = new Rectangle( 1.5, 3);
        rectangle2.display();
        System.out.println();

        // Test Square
        Square square1 = new Square(4);
        square1.display();
        Square square2 = new Square(1.5);
        square2.display();
        System.out.println();

        // Test the Triangle
        Triangle triangle1 = new Triangle(2.0, 4.0, 5.0);
        triangle1.display();
        System.out.println();
        // If not valid, it will throw an error;
        Triangle triangle2 = new Triangle(1.0, 2.0, 3.0);
        triangle2.display();
    }
}