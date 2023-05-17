package ss7.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        Circle circle = new Circle(3);
        Square square = new Square(9);
        Rectangle rectangle = new Rectangle(5,8);
        shape[0] = circle;
        shape[1] = square;
        shape[2] = rectangle;
        for (Shape s : shape) {
            if (s instanceof Colorable) {
                System.out.print(s.getArea() + " , ");
                ((Colorable) s).howToColor();
            } else {
                System.out.println(s.getArea());
            }
        }
    }
}
