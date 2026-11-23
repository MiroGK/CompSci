package Nov20;

public abstract class Polygon {
    private int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double getArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int sides) {
        numberOfSides = sides;
    }

    public String toString() {
        return "This is a Polygon.";
    }
}