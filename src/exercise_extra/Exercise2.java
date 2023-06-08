package exercise_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        String str1 = "aassddasdasdasd";
        String str2 = "asdda";
        List<String> strings = new ArrayList<>();
        String newStr;
        if(str1.length()<str2.length()){
            newStr=str1;
        }else {
            newStr=str2;
        }
        String[] s1 = newStr.split("");
        strings.addAll(Arrays.asList(s1));
        int count = 0;
        System.out.println(strings);
        for (String s : s1) {
            if (str2.contains(s)) {
                strings.remove(s);
                count++;
            }
        }
        System.out.println(strings);
        System.out.println(count);
    }
}
