package ss14_exception_debug.exercise;

import java.util.Scanner;


public class UseClassIllegalTriangleException {
    public static void main(String[] args) throws Exception {
        System.out.println("input side of triangle");
        boolean check;
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        do {
            side1 = inputSide(side1);
            side2 = inputSide(side2);
            side3 = inputSide(side3);
            try {
                checkTriangle(side1, side2, side3);
                check = false;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
                check = true;
            }
        } while (check);
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle);
    }

    public static void checkSideTriangle(int side) throws IllegalTriangleException {
        if (side <= 0) {
            throw new IllegalTriangleException("this number not a side");
        }
    }

    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
            throw new IllegalTriangleException("not a triangle");
        }

    }

    public static int inputSide(int side) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            try {
                System.out.println("input side");
                side = Integer.parseInt(scanner.nextLine());
                checkSideTriangle(side);
                check = false;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
                check = true;
            } catch (NumberFormatException n) {
                System.out.println("This is not a number");
                check = true;
            }
        } while (check);
        return side;
    }
}
