package Nov17;

import Nov20.Rectangle;

public class PolygonTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Sides (expect 4): " + rectangle.getNumberOfSides());
        System.out.println("Area (expect 15.0): " + rectangle.getArea());
    }
}
