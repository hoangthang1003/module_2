package ss12_tree_map.exercise.ex1;


import java.util.ArrayList;
import java.util.Scanner;

public class ProducManager extends Product {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> productsArrayList = new ArrayList<>();
    Product product1 = new Product(1, "Táo", 5);
    Product product2 = new Product(2, "Chuối", 2);
    Product product3 = new Product(3, "Dưa hấu", 9);

    {
        productsArrayList.add(product1);
        productsArrayList.add(product2);
        productsArrayList.add(product3);
    }

    public void display() {
        System.out.println(productsArrayList);
    }

    public void add() {
        display();
        Product product = new Product();
        System.out.println("Mời bạn nhập id");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập tên");
        product.setName(scanner.nextLine());
        System.out.println("Mời bạn nhập giá");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        productsArrayList.add(product);
        display();
    }

    public void deleteProduct() {
        display();
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : productsArrayList) {
            if (item.getId() == id) {
                productsArrayList.remove(item);
                display();
                return;
            }
        }
    }

    public void edit() {
        display();
        System.out.println("nhập id sản phâm bạn muốn sửa vào");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : productsArrayList) {
            if (item.getId() == id) {
                System.out.print("Moi ban nhap lai id: ");
                item.setId(Integer.parseInt(scanner.nextLine()));
                System.out.print("Moi ban nhap lai ten san pham: ");
                item.setName(scanner.nextLine());
                System.out.print("Moi ban nhap lai gia");
                item.setPrice(Double.parseDouble(scanner.nextLine()));
                display();
                break;
            }
        }
    }

    public void search() {
        System.out.println("Nhập vào sản phẩm muốn tìm kiếm");
        String name = scanner.nextLine();
        for (Product product : productsArrayList) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm này");
    }
}