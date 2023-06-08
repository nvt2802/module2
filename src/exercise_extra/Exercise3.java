package exercise_extra;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arr={3, 2, 4, 5, 9};
        int sum1;
        int sum2;
        boolean flag=false;
        for (int i = 1; i < arr.length-1; i++) {
            sum1=0;
            sum2=0;
            for (int j = 0; j < arr.length; j++) {
                if(j<i){
                    sum1+=arr[j];
                }
                if(j>i){
                    sum2+=arr[j];
                }
            }
            if(sum1==sum2){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
