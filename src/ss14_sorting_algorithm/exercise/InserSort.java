package ss14_sorting_algorithm.exercise;

import java.util.Arrays;

public class InserSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int k;
            for ( k = i-1; k >= 0 && arr[k] > key; k--) {
                arr[k+1] = arr[k];
            }
            arr[k + 1] = key;
            System.out.print("Bước " + i +"là "+Arrays.toString(arr)+"\n");
        }
        System.out.println("Mảng sau khi được sắp xếp là: " +Arrays.toString(arr) +"\n");
    }
}
