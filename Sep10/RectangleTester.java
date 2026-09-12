package Sep10;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        Rectangle choppedRect = new Rectangle(3,7);

        rect.getLength();
        rect.getWidth();
        rect.calculateArea();
        rect.calculatePerimeter();
        rect.calculateDiagonal();
        rect.toString();

        System.out.println(rect.toString() + "Its area is " 
        + rect.calculateArea() + ", its perimeter is " 
        + rect.calculatePerimeter() + ", and its diagonal is " + rect.calculateDiagonal() + ". ");
        System.out.println("Do both rectangles have the same length and width? Equal: " 
        + rect.equals(choppedRect));
    }
    
}
