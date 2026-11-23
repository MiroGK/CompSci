package Nov20;

public class ShapeTester {
    public static void main(String[] args) {
        // Copy your finished Rectangle.java, Square.java, and Triangle.java
        // from the Polygon Lab into this folder before you run this.
        ShapeTools tools = new ShapeTools();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Kite kite = new Kite(6, 4);

        // One Polygon[] holds four different kinds of shape.
        Polygon[] shapes = {rectangle, square, triangle, kite};

        // Uncomment each block as you finish its method.
        // System.out.println("total area: " + tools.totalArea(shapes));

        // System.out.println("largest: " + tools.largest(shapes));

        // System.out.print(tools.describeAll(shapes));

        // tools.scaleScalableShapes(shapes, 2);
        // System.out.println("after scaleScalableShapes(2): " + tools.totalArea(shapes));
    }
}
