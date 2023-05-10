package ss3_array.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int indexSumColumn;
        do {
            System.out.println("nhap index cua cot ban muon tinh tong: ");
            indexSumColumn = scanner.nextInt();
            if (indexSumColumn <= -1 && indexSumColumn >= matrix.length - 1) {
                System.out.println("nhap sai, nhaplai:");
            }
        } while (indexSumColumn <= -1 && indexSumColumn >= matrix.length - 1);
        int sumColumn = 0;
        for (int i = 0; i < column; i++) {
            sumColumn += matrix[i][indexSumColumn];
        }
        System.out.println("tong cua cot co index " + indexSumColumn + " la: " + sumColumn);
    }
}
