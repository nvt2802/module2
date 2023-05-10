package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAggregation {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap phan tu thu " + i + 1 + "cua array1");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhap phan tu thu " + i + 1 + "cua array2");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println("mang sau khi gop:");
        System.out.println(Arrays.toString(arr3));
    }
}
