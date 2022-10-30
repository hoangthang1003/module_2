package ss17_serialization.exercise.product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> products = new ArrayList<>();
    static {
        Product product1 = new Product(1, "Điện thoại", "Apple", 10000);
        Product product2 = new Product(2, "Máy tính", "MSI", 20000);
        Product product3 = new Product(3, "Giày thể thao", "Nike", 5000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
    static void writeFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\module_2\\src\\ss17_serialization\\exercise\\product\\product.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void addProduct() {
        Product product = new Product();
        System.out.println("Nhập vào thông tin sản phẩm");
        System.out.println("Mã sản phẩm:");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Tên sản phẩm:");
        product.setProduct(scanner.nextLine());
        System.out.println("Hãng sản xuất:");
        product.setProductCompany(scanner.nextLine());
        System.out.println("Giá:");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        products.add(product);

    }

    static void displayList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    static void search() {
        System.out.println("Nhập mã sản phẩm cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm");
    }
}