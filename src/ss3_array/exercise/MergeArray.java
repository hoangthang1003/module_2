package ss3_array.exercise;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        size1 = scanner.nextInt();
        System.out.println("Nhập độ dài mảng");
        size2 = scanner.nextInt();
        int[] array1 = {size1};
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] array2 = {size2};
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(array1 +"\n"+ array2);
    }
}
