package ss1.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int vnd = 23;
        int usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        usd = sc.nextInt();
        int convert = usd * vnd;
        System.out.println("Gia tri VND: " + convert);
    }
}
