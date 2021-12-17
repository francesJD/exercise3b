public class Circle extends Shape{
    static String shape = "circle";
    static double PI = 3.141592654;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    // Calculate the area of the circle
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    // Calculate the perimeter of the circle
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
