public class Square extends Shape{
    static String shape = "square";
    double sideLength;

    Square(double a) {
        this.sideLength = a;
    }

    void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");
        print();
    }

    @Override
    // Calculate the area of the square
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    // Calculate the perimeter of the square
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
