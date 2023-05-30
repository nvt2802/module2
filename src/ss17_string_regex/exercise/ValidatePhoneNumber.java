package ss17_string_regex.exercise;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\((\\d{2})\\)\\-\\((0\\d{9})\\)$";

        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("nhap sdt");
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches(regex)) {
                System.out.println("khong phai sdt, nhap lai:");
            }
        } while (!phoneNumber.matches(regex));
        System.out.println("hoan tat");
    }
}
