package ss4_method.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numberA,numberB,numberC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập A");
        numberA = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập B");
        numberB = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập C");
        numberC = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA,numberB,numberC);
        if(quadraticEquation.getDiscriminant() > 0) {
            System.out.print(quadraticEquation.getRoot1()+"\n" + quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.getDiscriminant() == 0){
            System.out.print(quadraticEquation.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}
