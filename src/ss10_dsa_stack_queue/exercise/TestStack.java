package ss10_dsa_stack_queue.exercise;

import java.util.Stack;

public class TestStack {
    private static void intergerStack() {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};


        for (Integer s : arr) {
            stack.push(s);
        }
        for (Integer s : stack) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (Integer s : arr) {
            stack.push(s);
        }
        System.out.println("sau khi dao nguoc");
        for (Integer s : stack) {
            System.out.println(s);
        }

    }

    private static void stringStack() {
        Stack<String> wStack = new Stack<>();
        String str = "Nguyen Van Tan";
        String[] mWork = str.split(" ");

        for (String s : mWork) {
            wStack.push(s);
        }
        for (String s : wStack) {
            System.out.println(s);
        }

        for (int i = 0; i < mWork.length; i++) {
            mWork[i] = wStack.pop();
        }
        for (String s : mWork) {
            wStack.push(s);
        }
        System.out.println("sau khi dao nguoc");
        for (String s : wStack) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        intergerStack();
        stringStack();
    }
}
