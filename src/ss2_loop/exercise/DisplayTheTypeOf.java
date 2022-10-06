package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayTheTypeOf {
    public static void main(String[] args) {
        int height, weight, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hày chọn hình" + "\n" + "1. Hình chữ nhật" + "\n" + " 2.Hình tam giác" + "\n" + "3. Hình tam giác ngược" + "\n"+"4. Exit");
        choose = scanner.nextInt();

        if (choose == 1) {
            System.out.println("Nhập vào số hàng");
            height = scanner.nextInt();
            System.out.println("Nhập vào số cột");
            weight = scanner.nextInt();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choose == 2) {
            System.out.println("Nhập vào chiều cao tam giác ");
            height = scanner.nextInt();
            System.out.print("Hình tam giác: " + "\n");
            for (int j = 1; j <= height; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int j = height; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choose == 3) {
            System.out.println("Nhập vào chiều rộng tam giác");
            height = scanner.nextInt();
            for (int i = 0; i <= height; i+=2) {
                for (int j = 0; j <= height-i ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } else {
            System.out.print("Exit");
        }
    }
}
