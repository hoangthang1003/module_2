package ss2_loop.exercise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int numBer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố");
        numBer = scanner.nextInt();
        int prefixNumber = 0;
        int check = 2;
        while (prefixNumber < numBer) {
            int count = 0;
            for (int i = 2; i <= check; i++) {
                if (check % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                prefixNumber++;
                System.out.println(check);
            }
            check++;
        }
    }
}
