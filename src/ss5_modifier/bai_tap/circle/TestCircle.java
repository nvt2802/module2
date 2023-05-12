package ss5_modifier.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
