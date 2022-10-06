package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteTheAnArraySection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int checkNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn kiểm tra");
        checkNumber = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber == arr[i]) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                i--;
                arr[arr.length - 1] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
