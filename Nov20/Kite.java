package Nov20;

public class Kite extends Polygon {
    private double diagonal1;
    private double diagonal2;

    public Kite(int diagonal1, int diagonal2) {
        super(4);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Kite() { // isnt there a way to just embed one above? 
        this(4, 2);
    }

    public double getArea() {
        return diagonal1 * diagonal2 / 2.0;
    }

    public String toString() {
        return super.toString() 
        + " It is also a kite, with a diagonal1 of " 
        + diagonal1 + ", and a diagonal2 of " 
        + diagonal2 + ". It's area is " + getArea() + ".";
    }
}
