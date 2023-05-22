package ss10_dsa_stack_queue.exercise;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapStr {
    public static void main(String[] args) {
        String str = "Nguyen Van Tan";

        Map<String, Integer> treeMap = new TreeMap<>();
        String[] arrStr = str.toLowerCase().split("");
        int valueCount;
        for (String s : arrStr) {
            valueCount = 0;
            if (s.equals(" ")) {
                continue;
            }
            for (String value : arrStr) {
                if (s.equals(value)) {
                    valueCount++;
                }
            }
            treeMap.put(s, valueCount);
        }

        Set<String> key = treeMap.keySet();
        for (String k : key) {
            System.out.println("key: " + k + ", value: " + treeMap.get(k));
        }
    }
}
