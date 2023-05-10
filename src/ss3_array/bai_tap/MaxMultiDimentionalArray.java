package ss3_array.bai_tap;

import java.util.Scanner;

public class MaxMultiDimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dong cua ma tran: ");
        int row = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("nhap phan tu co toa do" + i + "," + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max is:" + matrix[x][y] + " index is: " + x + "," + y);
    }
}
