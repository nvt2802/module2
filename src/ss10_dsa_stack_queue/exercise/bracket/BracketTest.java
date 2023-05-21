package ss10_dsa_stack_queue.exercise.bracket;

public class BracketTest {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        if(Bracket.checkBracket(str)){
            System.out.println("well");
        }else {
            System.out.println("???");
        }
    }
}

