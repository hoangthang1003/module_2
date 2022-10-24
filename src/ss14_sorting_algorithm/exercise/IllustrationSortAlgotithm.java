package ss14_sorting_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationSortAlgotithm extends InserSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mới");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là"+Arrays.toString(list));
        insertSort(list);
    }

}
