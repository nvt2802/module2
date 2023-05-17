package ss7.bai_tap.colorable;

import ss7.bai_tap.resizeable.Shape;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public double getArea() {
        return this.getLength()*this.getWidth();
    }

    public double getPrimeter() {
        return getLength() * 4;
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

    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
