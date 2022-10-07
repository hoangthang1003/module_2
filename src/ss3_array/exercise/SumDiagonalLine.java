package ss3_array.exercise;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA, numB;
        System.out.print("Nhập vào số cột");
        numA = scanner.nextInt();
        System.out.print("Nhập vào số hàng");
        numB = scanner.nextInt();
        int[][] array = new int[numA][numB];
        int sum = 0;
        for (int i = 0; i < numA; i++) {
            for (int j = 0; j < numB; j++) {
                System.out.print("Nhập vào phẩn tử thứ [" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
                if(i == j || j == numB - (i+1)) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
