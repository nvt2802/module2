package ss17_string_regex.exercise;

import java.util.Scanner;

public class ValidateClassesName {
    public static void main(String[] args) {
        String regex = "^([CAP])\\d{4}([GHIK])$";

        Scanner scanner = new Scanner(System.in);
        String classes;

        do {
            System.out.println("nhap ten lop");
            classes = scanner.nextLine();
            if (!classes.matches(regex)) {
                System.out.println("ten lop sai, nhap lai");
            }
        } while (!classes.matches(regex));
        System.out.println("hoan tat");
    }
}
