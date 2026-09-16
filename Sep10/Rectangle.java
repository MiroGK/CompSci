package Sep10;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculateArea() {
        return (length * width);
    }

    public int calculatePerimeter() {
        return ((2 * length) + (2 * width));
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonal;
    }

    public String toString() {
        return "This rectangle has a length " + length + " and width " + width + ". ";
    }
    
    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        } else {
            return false;
        }
    }
}
