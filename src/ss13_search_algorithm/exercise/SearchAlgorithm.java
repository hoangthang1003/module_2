package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng vào");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Số thứ tự là " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng vừa mới tạo " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng sau sắp xếp " + Arrays.toString(arr));
        System.out.println("Nhập số bạn muốn kiểm tra vào");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.print(binarySearch(arr, 0, arr.length - 1, value));
    }

    public static boolean binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (array[mid] == value) {
                return true;
            }
            if (value > array[mid]) {
                return binarySearch(array, mid + 1, right, value);
            }
            return binarySearch(array, left, mid - 1, value);
        }
        return false;
    }
}
