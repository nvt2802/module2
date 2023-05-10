package ss3_array.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class AddEleToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 0, 0};
        int X;
        int index;
        System.out.println(Arrays.toString(arr));
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap so muon chen:");
            X = scanner.nextInt();
            System.out.println("nhap index cua so can chen");
            index = scanner.nextInt();
        } while (index <= -1 && index >= arr.length - 1);

        arr[arr.length - 1] = X;
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
            arr[arr.length - 2 - i] = tmp;
            if (arr.length - 2 - i == index) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
