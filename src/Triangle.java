public class Triangle extends Shape{
    static String shape = "triangle";
    private double e1;
    private double e2;
    private double e3;


    Triangle(double edge1, double edge2, double edge3) {
        this.e1 = edge1;
        this.e2 = edge2;
        this.e3 = edge3;
    }

    // Test whether if it is a valid triangle (the sum of the two edges > the third edge)
    private void testValid() throws InvalidTriangle{
        if (e1 + e2 > e3 && e2 + e3 > e1 && e1 + e2 > e3) {
        }
        else {
            throw new InvalidTriangle(e1, e2, e3);
        }
    }

    @Override
    // Calculate the area of the triangle
    public double calculateArea() {
        double h = 0.5 * calculatePerimeter();
        double area = Math.sqrt(h * (h - e1) * (h - e2) * (h - e3));
        return area;
    }

    @Override
    // Calculate the perimeter of the triangle
    public double calculatePerimeter() {
        return e1 + e2 + e3;
    }

    public void display() {
        System.out.println("====================== " + shape + " Test Starts: ======================");

        try {
            testValid();
            print();
        }
        catch (InvalidTriangle e) {
            e.printStackTrace();
        }
    }
}

class InvalidTriangle extends Exception {
    double a, b, c;

    InvalidTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // If it is not a valid triangle, shows "Invalid Ege Input"
    public String getMessage() {
        return "Invalid Edge Input";
    }
}