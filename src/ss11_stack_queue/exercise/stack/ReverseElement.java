package ss11_stack_queue.exercise.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHập số lượng phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) +"là: " );
            int element = scanner.nextInt();
            integers.push(element);
        }
        System.out.println(integers);
        Stack<Integer> wStack = new Stack<>();
        while (!integers.isEmpty()) {
            System.out.print( integers.pop());
        }
    }
}
