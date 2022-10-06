package ss3_array.exercise;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA, numB;
        System.out.print("Nhập vào số cột");
        numA = scanner.nextInt();
        System.out.print("Nhập vào số hàng");
        numB = scanner.nextInt();
        int[][] array = new int[numA][numB];
        int max = array[0][0];
        int buttress = 0;
        int row = 0;
        for (int i = 0; i < numA; i++) {
            for (int j = 0; j < numB; j++) {
                System.out.print("Nhập vào phẩn tử thứ [" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
                if(array[i][j] > max) {
                    max = array[i][j];
                    buttress = i;
                    row = j;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("giá trị lớn nhất của mảng là: " +  max+ " tại vị trí là: " + " hàng " + row + " cột " + buttress);
    }
}
