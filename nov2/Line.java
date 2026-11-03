package nov2;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double calculateSlope() {
        double slope = (((double) (p2.getY() - p1.getY())) / (p2.getX() - p1.getX()));
        return slope;
    }

    public String pointSlopeForm() {
        String output = "(y - " + p1.getY() + ") = " 
        + calculateSlope() + "(x - " + p1.getX() + ")";
        return output;
    }

    public boolean isCoordinateOnLine(Point p) {
        double a = -(p2.getY() - p1.getY());
        double b = p2.getX() - p1.getX();
        double c = -(a * p1.getX() + b * p1.getY());
        if (p == null) return false; 
        if (((a * p.getX()) + (b * p.getY()) + c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void shift(int dx, int dy) {
        this.p1.setX(this.p1.getX() + dx);
        this.p2.setX(this.p2.getX() + dx);
        this.p1.setY(this.p1.getY() + dy);
        this.p2.setY(this.p2.getY() + dy);
    }

    public boolean isParallelTo(Line other) {
        if (other == null) return false; 
        if (this.calculateSlope() == other.calculateSlope()) {
            return true;
        } else {
            return false;
        }
    }

    public Line copy() {
        return new Line (new Point(p1.getX(), p1.getY()), 
        new Point(p2.getX(), p2.getY()));
    }
}