public class Triangle implements Shape{
    private double alap;
    private double magassag;

    public Triangle(double alap, double magassag) {
        this.magassag = magassag;
        this.alap = alap;
    }

    @Override
    public double getArea() {
        return  (alap * magassag) / 2;
    }
}
