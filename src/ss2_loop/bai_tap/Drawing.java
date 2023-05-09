package ss2_loop.bai_tap;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw isosceles triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("* ");
                        }

                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 10; i+=2) {
                        for (int j = 0; j < 10 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
