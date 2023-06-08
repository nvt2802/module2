package exercise_extra;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 5, 2, 7, 1};
        System.out.println(exchangeMoney(arr, 7));
    }

    private static int exchangeMoney(int[] arr, int n) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == 0) {
                    continue;
                }
                if (n - arr[j] + arr[i] > max) {
                    max = n - arr[j] + arr[i];
                }
            }
        }
        return Math.max(max, n);
    }
}
