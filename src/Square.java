public class Square extends Shape{
    double sideLength;
    static String shape = "square";

    Square(double a) {
        this.sideLength = a;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
