package ss1_introduction.exercise;

import java.util.Scanner;

public class Untitled {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD vào");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị VND: " + quydoi+" VND");
    }
}
