package ss3_array.bai_tap;

import java.util.Arrays;

public class Splice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 6, 8};
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                arr[i] = 0;
                for (int j = i; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
