package exercise_extra;

import java.util.Set;
import java.util.TreeSet;

public class Exercise7 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,43},
                {9,4,11,7},
                {11,6,4,0},
                {1,2,6,51}};
        System.out.println(primeMultiArr(arr));
    }
    private static Set<Integer> primeMultiArr(int[][] arr){
        Set<Integer> list = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(isPrime(arr[i][j])){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
    private static boolean isPrime(int number){
        if(number<2){
            return false;
        }else {
            for (int i = 2; i<=Math.sqrt(number); i++) {
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
