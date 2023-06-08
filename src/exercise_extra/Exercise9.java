package exercise_extra;

public class Exercise9 {
    public static void main(String[] args) {
        int L =10;
        int R = 100;
        int count=0;
        for (int i = L; i <R ; i++) {
           String str= Integer.toString(i);
            if(str.charAt(0)==str.charAt(str.length()-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
