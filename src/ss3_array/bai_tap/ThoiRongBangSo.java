package ss3_array.bai_tap;

public class ThoiRongBangSo {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i += 2) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j > 0 && j < i - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(i / 2 + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= 8; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++) {
                if (j > 0 && j < 10-i-1) {
                    System.out.print("  ");
                } else {
                    System.out.print(5 - i / 2 + " ");
                }
            }
            System.out.println();
        }
    }
}
