package ss14_exception_debug.exercise;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle() {
    }

    public Triangle(int side1, int side2, int side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide(int side1, int side2, int side3) {
        try {
            UseClassIllegalTriangleException.checkTriangle(side1, side2, side3);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println(illegalTriangleException.getMessage());
        }
    }
}
