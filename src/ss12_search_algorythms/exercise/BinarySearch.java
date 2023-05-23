package ss12_search_algorythms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 4, 8, 6, 5, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can tim");
        int num = Integer.parseInt(scanner.nextLine());

        int result = binarySearch(arr, 0, arr.length - 1, num);
        if (result == -1) {
            System.out.println("so nay khong co trong mang");
        } else {
            System.out.println("so ban can tim co vi tri la: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        return binarySearch(array, left, right, value);
    }
}
