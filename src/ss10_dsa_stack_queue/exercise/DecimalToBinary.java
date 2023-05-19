package ss10_dsa_stack_queue.exercise;

import java.util.Stack;

public class DecimalToBinary {
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        int lenngth = stack.size();
        for (int i = 0; i < lenngth; i++) {
            newStack.push(stack.pop());
        }
        return newStack;
    }

    public static void main(String[] args) {
        int n = 10000;
        Stack<Integer> stack = new Stack<>();
        System.out.println("he nhi phan cua " + n + " la ");
        while (n > 0) {
            stack.push(n % 2);
            if (n % 2 == 1) {
                n = (n - 1) / 2;
            } else {
                n /= 2;
            }
        }
        stack = reverseStack(stack);
        System.out.println(stack);

        n = 0;
        for (Integer integer : stack) {
            n = n * 2 + integer;
        }
        System.out.println("doi sang he thap phan: " + n);


    }
}
