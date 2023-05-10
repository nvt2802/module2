package ss3_array.bai_tap;

import java.util.Scanner;

public class SumDiagonalSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai cua ma tran vuong: ");
        int lengthArr = scanner.nextInt();

        int[][] matrix = new int[lengthArr][lengthArr];
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("nhap phan tu co toa do" + i + "," + j);
                matrix[i][j] = scanner.nextInt();
                if (i == j) {
                    sumDiagonal1 += matrix[i][j];
                }
                if (i + j == (matrix.length - 1)) {
                    sumDiagonal2 += matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("tong cua dong cheo 1 la:" + sumDiagonal1);
        System.out.println("tong cua dong cheo 2 la:" + sumDiagonal2);


    }
}
