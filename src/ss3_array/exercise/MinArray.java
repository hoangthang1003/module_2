package ss3_array.exercise;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập độ dài mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
