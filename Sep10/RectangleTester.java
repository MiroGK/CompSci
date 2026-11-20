package Sep10;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle_old rect = new Rectangle_old(5,10);
        Rectangle_old choppedRect = new Rectangle_old(3,7);

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
