package ss7.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,10);
        Square square = new Square(4);
        shape[0]=circle;
        shape[1]=rectangle;

        shape[2]=square;
        int random = (int)(Math.random() * 100 + 1);
        System.out.println("so random: "+random);

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i]);
            shape[i].resize(random);
            System.out.println(shape[i]);
        }

    }
}
