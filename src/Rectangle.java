public class Rectangle extends Shape{
    static String shape = "rectangle";
    private double length;
    private double width;

    Rectangle(double a, double b) {
        this.length = a;
        this.width = b;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    // Calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    @Override
    // Calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
