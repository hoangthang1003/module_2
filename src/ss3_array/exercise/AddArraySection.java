package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddArraySection {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int numBer, index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        numBer = scanner.nextInt();
        System.out.println("Nhập vị trí chèn");
        index = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i] = numBer;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
