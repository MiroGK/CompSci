package Nov17;

public class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
        if (length < 0) {
            this.length = 0;
        }
        if (width < 0) {
            this.length = 0;
        }
    }

    public Rectangle() {
        super(4);
        this.length = 4;
        this.width = 3;
    }

    public void setLength(int length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        String output = super.toString() + 
        "This shape is a rectangle with length " + length + 
        ", width " + width + ", and area " + getArea() + ".";
        return output;
    }
}
