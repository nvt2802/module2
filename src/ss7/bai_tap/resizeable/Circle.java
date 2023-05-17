package ss7.bai_tap.resizeable;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setArea(double area){
        setRadius(Math.sqrt(area/Math.PI));
    }
    public void resize(double percent){
        setArea(getArea()+getArea()*percent/100);
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                +", area="+getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
