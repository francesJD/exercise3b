public class Circle extends Shape{
    double radius;
    static String shape = "circle";
    static double PI = 3.141592654;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
