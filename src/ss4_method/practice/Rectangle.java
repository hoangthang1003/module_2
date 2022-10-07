package ss4_method.practice;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPeriMeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Chiều rộng là " + width + "\n Chiều dài là "  +height;
    }

    public static void main(String[] args) {
        double width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài");
        height = scanner.nextDouble();
        System.out.print("Nhập vào chiều rộng");
        width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Chiều dài và chiều rộng là \n" + rectangle.display());
        System.out.println("Diện tích là" + rectangle.getArea());
        System.out.println("Chiều dài và chiều rộng là" + rectangle.getPeriMeter());
    }
}
