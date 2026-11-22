package Nov17;

public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
        if (base < 0) {
            this.base = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public void setBase(int base) {
        if (base < 0) {
            this.base = 0;
        } else {
            this.base = base;
        }
    }

    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return (base * height / 2.0);
    }

    public String toString() {
        String output = super.toString() + 
        "This shape is a triangle with base " 
        + base + ", height " + height + ", and area " 
        + getArea() + ".";
        return output;
    }
}
