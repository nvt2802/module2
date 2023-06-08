package exercise_extra;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("x:");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("y:");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.println("s:");
            int s = Integer.parseInt(scanner.nextLine());
            System.out.println("result:");
            System.out.println(promotion(x, y, s));
        } while (true);
    }

    private static int promotion(int x, int y, int s) {
        int temp = 0;
        if(x<=0||y<=0){
            return s;
        }
        while (s > 0) {
            if (s > x) {
                s -= x + y;
                temp += x;
            } else {
                s -= x + y;
                temp += x + y + s;
            }
        }
        return temp;
    }
}
