package ss12_search_algorythms.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxSubsequence {
    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        String string = "abcabcdgabmnsxy";

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) {
            System.out.print(ch);
        }


    }
}