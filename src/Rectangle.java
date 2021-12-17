public class Rectangle extends Shape{
    private double length;
    private double width;
    static String shape = "rectangle";

    Rectangle(double a, double b) {
        this.length = a;
        this.width = b;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
