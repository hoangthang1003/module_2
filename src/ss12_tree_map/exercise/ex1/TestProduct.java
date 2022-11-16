package ss12_tree_map.exercise.ex1;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        do {
            System.out.println("------CHOICE------\n" +
                    "1.Add product\n" +
                    "2.Edit product\n" +
                    "3.Delete product\n" +
                    "4.Display products\n " +
                    "5.Search product\n" +
                    "6.Exit");
            System.out.print("Choice of you : ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose < 1 || choose > 6) {
                System.out.println("Nhập lại số từ 1 đến 6");
                continue;
            }
            switch (choose) {

                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(1);
            }
        } while (true);
    }
}
