package ss3_array.bai_tap;

import ss3_array.thuc_hanh.FindMinimum;

public class MinimumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, -1, -2, 5, -9, 12};
        int index = FindMinimum.minValue(arr);
        System.out.println("gia tri nho nhat trong mang la: " + arr[index]);
    }
}
