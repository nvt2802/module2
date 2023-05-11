package ss4_oop.bai_tap.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    void result() {
        if (getDiscriminant() > 0) {
            System.out.println("phuong trinh co 2 nghiem:" + getRoot1() + "," + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("phuong trinh co 2 nghiem kep:" + getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
