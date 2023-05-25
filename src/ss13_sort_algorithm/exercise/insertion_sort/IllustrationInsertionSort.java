package ss13_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;

public class IllustrationInsertionSort {
    /**
     * @author TanTan
     * @param array mang can sap xep
     * minh hoa thuat toan sap xep
     */
    public static void insertionSort(int[] array) {
        int pos;
        int x;
        for (int i = 1; i < array.length; i++) {
            pos = i;//vi tri phan tu lay ra
            x = array[i];//lay ra arr[i]gan vao x
            System.out.print("lay " + array[pos] + " so sanh voi: ");
            while (pos > 0 && array[pos - 1] > x) {//lap den khi phan tu trc do be hon x
                array[pos] = array[pos - 1];//gan phan tu hien tai bang phan tu dung truoc
                System.out.print(array[pos] + " ");
                pos--;
            }
            array[pos] = x;//gan x vao phan tu duoc chon
            System.out.println("\nchen " + array[pos] + " vao vi tri: " + pos);
            System.out.println(Arrays.toString(array));
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 8, 7, 3, 6, 9, 7, 8, 0};

        System.out.println("mang ban dau: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("ket thuc");
    }
}
