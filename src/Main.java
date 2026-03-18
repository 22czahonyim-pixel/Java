class  Main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,12);

        Circle circle = new Circle(5);

        Triangle triangle = new Triangle(4,10);

        System.out.println("A négyzet területe: " + rectangle.getArea());
        System.out.println("A kör területe: " + circle.getArea());
        System.out.println("A háromszög területe: " + triangle.getArea());

    }
}
