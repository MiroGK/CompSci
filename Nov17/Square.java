package Nov17;

public class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        super(4, 4);
    }

    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
