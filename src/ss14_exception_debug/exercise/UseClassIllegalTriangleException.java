package ss14_exception_debug.exercise;

import java.util.Scanner;

public class UseClassIllegalTriangleException {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap 3 canh cua tam giac");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int side1;
        int side2;
        int side3;
        do {
            System.out.println("Nhap canh thu nhat");
            side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh thu hai");
            side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh thu ba");
            side3 = Integer.parseInt(scanner.nextLine());
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

    /**
     * @author tantan
     * @param side1
     * @param side2
     * @param side3
     * @throws IllegalTriangleException
     * kiem tra 3 canh nhap vao co phai la 3 canh cua tam giac
     */
    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
            throw new IllegalTriangleException("not a triangle");
        }
    }

}
