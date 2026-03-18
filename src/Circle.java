import com.sun.tools.javac.Main;

public class Circle implements  Shape{

    private double sugar;

    public Circle(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double getArea() {
        return Math.PI * sugar * sugar;
    }
}
