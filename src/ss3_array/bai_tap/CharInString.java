package ss3_array.bai_tap;

import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        String str = new String("aaaanhyyy     yyyyeuecccm");
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 ky tu");
        c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
