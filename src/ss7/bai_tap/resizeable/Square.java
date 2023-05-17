package ss7.bai_tap.resizeable;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPrimeter() {
        return side * 4;
    }

    public void setArea(double area) {
        setSide(Math.sqrt(area));
    }

    @Override
    public String toString() {
        return "A Square with " +
                "side=" + getSide()
                + ", area=" + getArea()
                + ", which is a subclass of "
                + super.toString()
                ;
    }

    public void resize(double percent) {
        setArea(getArea() + getArea() * percent / 100);
    }
}
