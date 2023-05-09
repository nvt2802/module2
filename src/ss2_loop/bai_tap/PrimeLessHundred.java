package ss2_loop.bai_tap;

public class PrimeLessHundred {
    public static void main(String[] args) {
        int number=2;
        while(number <100){
            if(IsPrime.isPrime(number)){
                System.out.println(number);
            }
            number++;
        }
    }
}
