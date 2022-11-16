package testcase;

import java.util.Scanner;

public class s3 {
    private static boolean fibonacci(int n) {
        long f1=0;
        long f2=1;
        long fn=0;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                fn = f1+f2;
                f1 =f2;
                f2 =fn;
                System.out.println(fn);
            }
        }
        return false;
    }
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
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên dương");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (fibonacci(n) ) {
                System.out.println(i);
            }
        }
    }
}
