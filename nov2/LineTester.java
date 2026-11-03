package nov2;

/*
 * REQ 01: answer question 1 before you write any other code.
 * Answer question 2 last, after you finish REQ 10.
 *
 * 1. Your tester runs the three lines below. How many Point objects
 *    exist afterward, and what does line.getP1().getX() return? Why?
 *        Point start = new Point(1, 4);
 *        Line line = new Line(start, new Point(2, 7));
 *        start.setX(6);
 *    Answer:
 * 
 * Two point objects exist afterwards, getting
 * the x of P1 returns 6 
 *
 * 2. Two methods in this lab take a parameter that can be null.
 *    Name them, and say what each one returns for null.
 *    Answer:
 */
public class LineTester {
    public static void main(String[] args) {
        Point start = new Point(2, 7);
        Point end = new Point(1, 4);
        Line pointLine = new Line(start, end);
        System.out.println("Slope: " + pointLine.calculateSlope());

        System.out.println("Start X: " + start.getX());
        System.out.println("Start Y: " + start.getY());
        start.setX(-4);
        start.setY(-3);
        System.out.println("New start distance to end: " + start.distanceTo(end));
        System.out.println(pointLine.getP1() == start);
        System.out.println(pointLine.pointSlopeForm());
    }
}