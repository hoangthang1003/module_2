package ss11_stack_queue.exercise.move;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập chuỗi");
        String string = scanner.nextLine();
        String[] stringArray = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (String str : stringArray) {
            stack.push(str.toLowerCase());
            queue.add(str.toLowerCase());
        }
        String string1 = "";
        String string2 = "";
        while (!stack.isEmpty() && !queue.isEmpty()) {
            string1 += stack.pop();
            string2 += queue.poll();
        }
        if (string1.toString().equals(string2.toString())) {

            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}
