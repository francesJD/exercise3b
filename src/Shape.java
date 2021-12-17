public abstract class Shape implements java.io.Serializable{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void print() {

        System.out.println("The area of the shape is: " + calculateArea());

        System.out.println("The perimeter of the shape is: " + calculatePerimeter());
    }
}
