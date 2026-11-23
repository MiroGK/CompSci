package Nov17;

import Nov20.Polygon;

public class RegularHexagon extends Polygon {
    private double sideLength;

    public RegularHexagon(double sideLength) {
        super(6);
        this.sideLength = sideLength;
    }

    public RegularHexagon() {
        super(6);
        sideLength = 1.0;
    }

    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    public String toString() {
        return super.toString() 
        + " This shape is a regular hexagon with side length " 
        + sideLength + ".";
    }
}
