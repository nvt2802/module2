package exercise_extra;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        int[] arr = {1 ,4 ,4 ,3, 2,1,2, 1};
        System.out.println(taxi(arr));
    }

    private static int taxi(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        System.out.println("Mang ban dau: "+list);
        for (int i = 0; i < list.size(); i++) {
           for (int j = 0; j < list.size(); j++) {
               if(i==j){
                   continue;
               }
                if (list.get(i) + list.get(j) <= 4) {
                    System.out.println("gia tri: "+list.get(i) +"+"+ list.get(j));
                    System.out.println("vi tri: "+i +"+"+j);
                    list.set(i, list.get(i)+list.get(j));
                    list.remove(j);
                }
            }
        }
        System.out.println("Mang sau khi sap xep: "+list);
        return list.size();
    }
}
