package testcase;

import java.util.Scanner;

public class s1 {
    public static boolean Prime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\d+";
        String number;
        do {
            System.out.println("Nhập vào 1 số nguyên dương");
             number = scanner.nextLine();

        } while (!number.matches(regex));
        for (int i = 0; i < Integer.parseInt(number); i++) {
            if (!Prime(i)) {
                System.out.println(i);
            }
        }
    }
}
