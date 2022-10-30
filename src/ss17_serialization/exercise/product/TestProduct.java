package ss17_serialization.exercise.product;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        int choice;
        do {
            System.out.println("=========Menu=========\n" +
                    "1.\tThêm sản phẩm\n" +
                    "2.\tHiển thị sản phẩm\n" +
                    "3.\tTìm kiếm thông tin sản phẩm\n" +
                    "4.\tThoát\n" );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManagement.addProduct();
                    productManagement.writeFile();
                    break;
                case 2:
                    productManagement.displayList();
                    break;
                case 3:
                    productManagement.search();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }
}
