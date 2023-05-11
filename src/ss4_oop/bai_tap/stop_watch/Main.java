package ss4_oop.bai_tap.stop_watch;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        int indexMin, i, j;
        int[] arr= new int[100000];
        for (i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch);
        System.out.println(stopWatch.getElapsedTime());

    }

}
