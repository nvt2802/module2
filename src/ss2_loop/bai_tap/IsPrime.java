package ss2_loop.bai_tap;

public class IsPrime {
    public static void main(String[] args) {
        int n = 0;
        int number = 2;
        while (n <= 20) {
            if (isPrime(number)) {
                System.out.println(number);
                n++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++)
                if (number % i == 0) {
                    return false;

                }
            return true;
        }

    }
}
