package ss3_array.exercise;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA, numB, choose;
        System.out.print("Nhập vào số cột");
        numA = scanner.nextInt();
        System.out.print("Nhập vào số hàng");
        numB = scanner.nextInt();
        System.out.print("Nhập vào cột bạn muốn tính tổng");
        choose = scanner.nextInt();
        int[][] arr = new int[numA][numB];
        int sum = 0;
        for (int i = 0; i < numA; i++) {
            for (int j = 0; j < numB; j++) {
                System.out.print("Nhập vào phẩn tử thứ [" + i + "][" + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < arr[choose].length; j++) {
            sum += arr[choose][j];
        }
        System.out.print(sum);
    }
}


