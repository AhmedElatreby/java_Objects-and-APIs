package inheritance.shapes;

public class InheritanceChecker {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.print();
        square.print("Ahmed");
        square.print("Hello");
    }
}