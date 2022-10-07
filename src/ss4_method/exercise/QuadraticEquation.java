package ss4_method.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double numA, numB, numC;

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getDiscriminant() {
        return numB * numB - 4 * numA * numC;
    }

    public double getRoot1() {
        return ((-numB)+ Math.sqrt(numB * numB - 4 * numA * numC))/2*numA;
    }

    public double getRoot2() {
        return ((-numB)- Math.sqrt(numB * numB - 4 * numA * numC))/2*numA;
    }

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
