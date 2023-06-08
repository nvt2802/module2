package exercise_extra;

import java.util.Map;
import java.util.TreeMap;

public class Exercise8 {
    public static void main(String[] args) {
        int[] parent = {1,4,5,2,3};
        int[] son = {1,2,3};
        Map<Integer,Integer> map = new TreeMap<>();
        for (int k : son) {
            map.put(k, 0);
        }
        for (int k : son) {
            for (int i : parent) {
                if (k == i) {
                    map.put(k, map.get(k)+1);
                }
            }
        }
        int min=map.get(son[0]);
        for (int i = 1; i < map.size(); i++) {
            if(map.get(son[i])<min){
                min=map.get(son[i]);
            }
        }
        System.out.println(min);
    }
}
