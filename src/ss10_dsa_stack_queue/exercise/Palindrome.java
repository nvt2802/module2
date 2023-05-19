package ss10_dsa_stack_queue.exercise;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();

        Stack<String> stringStack = new Stack<>();

        String str = "Able was I ere I saw elbA";

        String[] work = str.split("");

        for (String s : work) {
            stringQueue.add(s);
            stringStack.add(s);
        }

        int count = 0;
        for (int i = 0; i < work.length; i++) {
            if (stringStack.pop().equals(stringQueue.poll())) {
                count++;
            }
        }
        if (count == work.length) {
            System.out.println(str + ": la chuoi palindrome");
        } else {
            System.out.println(str + ": khong phai la chuoi palindrome");
        }
    }
}
