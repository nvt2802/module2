package exercise_extra;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int temp;
//        FOR:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == -1 || arr[j] == -1) {
                    continue ;
                }
                if (arr[i]<arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
