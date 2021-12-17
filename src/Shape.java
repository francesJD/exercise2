public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void print() {
        System.out.println("The area of the shape is: " + calculateArea());
        System.out.println("The perimeter of the shape is: " + calculatePerimeter());
    }
}
