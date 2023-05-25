package ss13_sort_algorithm.exercise.insertion_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Str {
    public static void main(String[] args) {
        String s = "CodeGym";
        String newStr = "";
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].toUpperCase().contains(str[i]) && i > 0) {
                newStr += " " + str[i];
            } else {
                newStr += str[i];
            }
        }
        System.out.println(newStr.toLowerCase());
    }
}
