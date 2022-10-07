package ss3_array.exercise;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì");
        String str = scanner.nextLine();
        char character = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Kí tự cần tìm là:" + character);
        System.out.print("Số kí tự giống nhau tìm được là: " + count);
    }
}
