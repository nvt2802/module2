package ss3_array.thuc_hanh;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,4,6,8,8};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] array) {
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        return array;
    }
}
