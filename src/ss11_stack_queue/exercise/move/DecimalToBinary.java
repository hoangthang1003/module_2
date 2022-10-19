package ss11_stack_queue.exercise.move;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0 ) {
            stack.push(number % 2);
            number /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

