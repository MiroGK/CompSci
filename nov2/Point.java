package nov2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        double distance = Math.sqrt(Math.pow(other.x - this.x, 2) 
        + Math.pow(other.y - this.y, 2));
        return distance;
    }

    public Point midpointWith(Point other) {
        return new Point((x + other.getX()) / 2, (y + other.getY()) / 2);
    }
}
