package ss11_stack_queue.exercise.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập từ có trong chuỗi: ");
        StringBuilder mWord = new StringBuilder(scanner.nextLine());
        String[] stringArray = mWord.toString().split("");
        for (String item : stringArray) {
            wStack.push(item);
        }
        mWord = new StringBuilder();
        while (!wStack.isEmpty()) {
            mWord.append(wStack.pop());
        }
        System.out.println("Chuỗi sau khi đảo ngược là: " + mWord);
    }
}
