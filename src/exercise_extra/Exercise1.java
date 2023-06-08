package exercise_extra;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1 };
        System.out.println(checkEqualFrequency(arr));
    }
    public static boolean checkEqualFrequency(int[] array){
        int count = 0;
        Map<Integer,Integer> integerMap = new TreeMap<>();
        for (int j : array) {

            if (!integerMap.containsKey(j)) {
                integerMap.put(j, 0);
            } else {
                count=integerMap.get(j) + 1;
                integerMap.put(j,count );
            }
        }
        Set<Integer> key = integerMap.keySet();
        for (Integer i: key){
            if(integerMap.get(i)!=integerMap.get(array[0])){
                return false;
            }
        }
       return true;
    }
}
