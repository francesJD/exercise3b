public class Triangle extends Shape{
    private double e1;
    private double e2;
    private double e3;
    static String shape = "triangle";

    Triangle(double edge1, double edge2, double edge3) {
        this.e1 = edge1;
        this.e2 = edge2;
        this.e3 = edge3;
    }

    private void testValid() throws InvalidTriangle{
        if (e1 + e2 > e3 && e2 + e3 > e1 && e1 + e2 > e3) {
        }
        else {
            throw new InvalidTriangle(e1, e2, e3);
        }
    }

    @Override
    public double calculateArea() {
        double p = 0.5 * calculatePerimeter();
        double area = Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
        return area;
    }

    @Override
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

    public String getFeedback() {
        return "Invalid Input";
    }
}
