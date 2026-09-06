public class ShapeManagementApp {

    
    static void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    
    static void area(int length, int width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    
    static void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        System.out.println("SHAPE MANAGEMENT");
        System.out.println("-----------------");

        area(5);
        area(10, 4);
        area(3.0);

    }
}