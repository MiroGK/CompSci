package Nov20;

public class ShapeTools {
    public double totalArea(Polygon[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].getArea();
        }
        return sum;
    }

    public Polygon largest(Polygon[] shapes) {
        double best = shapes[0].getArea();
        Polygon bestShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > best) {
                best = shapes[i].getArea();
                bestShape = shapes[i];
            }
        }
        return bestShape;
    }

    public String describeAll(Polygon[] shapes) {
        String output = "";
        for (int i = 0; i < shapes.length; i++) {
            output += shapes[i].toString() + "\n";
        }
        return output;
    }

    public void scaleAll(Scalable[] items, double factor) {
        for (int i = 0; i < items.length; i++) {
            items[i].scale(factor); // have to cast??
        }
    }

    public void scaleScalableShapes(Polygon[] shapes, double factor) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Scalable) {
                Scalable scalablePointer = (Scalable) shapes[i];
                scalablePointer.scale(factor);
            }
        }
    }

    public int countLargerThan(Polygon[] shapes, double area) {
        int count = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getArea() > area) {
                count += 1;
            }
        }
        return count;
    }
}
