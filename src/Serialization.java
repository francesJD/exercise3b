import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(1, 2);
        Square s = new Square(10);
        Triangle t = new Triangle(6, 6, 6);

        try {
            FileOutputStream fileOut = new FileOutputStream("Shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.writeObject(r);
            out.writeObject(s);
            out.writeObject(t);
            out.close();
            System.out.println("Serialized data is saved in Shape.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Circle newC = null;
        Rectangle newR = null;
        Square newS = null;
        Triangle newT = null;
        try {
            FileInputStream fileIn = new FileInputStream("Shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            newC = (Circle) in.readObject();
            newR = (Rectangle) in.readObject();
            newS = (Square) in.readObject();
            newT = (Triangle) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Shape.ser has been deserialized");
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        newC.display();
        System.out.println();

        newR.display();
        System.out.println();

        newS.display();
        System.out.println();

        newT.display();
        System.out.println();
    }
}
