package ss13_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;

public class SetUpInsertSort {

    /**
     * @author TanTan
     * @param list mang can sap xep theo sap xep chen
     * mang truyen vao se duoc sap xep theo thu tu tu be den lon theo thuat toan sap xep chen
     */
    public static void insertionSort(int[] list) {
        int index;
        int last;
        for (int i = 1; i < list.length; i++) {//de duyet tu phan tu thu 2 den cuoi mang
            last = list[i];//lay ra phan tu thu i va gan cho last
            index = i;//index cua phan tu lay ra
            while (index > 0 && list[index - 1] > last) {//vong lap de doi vi tri cac phan tu lon hon last
                list[index] = list[index - 1];//gan phan tu hien tai bang phan tu dung truoc
                index--;//giam index
            }
            list[index] = last;//gan last vao phan tu duoc chon
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,7,95,6,75,4,7,0,3,345,645,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
