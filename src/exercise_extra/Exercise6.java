package exercise_extra;

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        String str = "abdceffecdba";
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList(str.split("")));
        List<String> newStringList = new ArrayList<>();
        Set<String> result = new TreeSet<>();
        for (int i = str.length()-1; i >=0; i--) {
            if(!newStringList.contains(stringList.get(i))){
                newStringList.add(stringList.get(i));
            }else {
                result.add(stringList.get(i));
            }
        }
        System.out.println(result);
     }
}
