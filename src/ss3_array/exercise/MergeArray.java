package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập độ dài mảng 2");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            array2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));
        System.out.println();
        int[] newArray = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            newArray[array1.length+j] = array2[j];
        }
        System.out.println(Arrays.toString(newArray));

    }
}
