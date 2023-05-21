package ss10_dsa_stack_queue.exercise.bracket;

import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String string) {
        Stack<String> bStack = new Stack<>();
        String[] sym = string.split("");
        String left;

        for (String s : sym) {
            if (s.equals("(")) {
                bStack.push(s);
            }
            if (s.equals(")")) {
                if (bStack.size() == 0) {
                    return false;
                }
                left = bStack.pop();
                if (!(left + s).equals("()")) {
                    return false;
                }
            }
        }
        return bStack.size() == 0;
    }
}
