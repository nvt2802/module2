package ss5_modifier.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String corlor = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }
}
