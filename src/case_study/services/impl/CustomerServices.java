package case_study.services.impl;

import case_study.model.Customer;
import case_study.services.ICustomerManagement;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServices implements ICustomerManagement {
    Scanner scanner = new Scanner(System.in);

    public static List<Customer> listCustomer = new LinkedList<>();
    static {
        listCustomer.add(new Customer(1, "Thắng", "10/03/2004", "Nam", "1234", "0923084563", "ac@gmail.com", "Bạc", "Đà Nẵng"));
        listCustomer.add(new Customer(2, "Minh", "10/03/2004", "Nam", "1234", "0923084563", "ac@gmail.com", "Vàng", "Đà Nẵng"));
    }
    @Override
    public void display() {
        for (Customer c:listCustomer) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        int id = CustomerServices.listCustomer.get(CustomerServices.listCustomer.size() - 1).getId() + 1;
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm của khách hàng vào ");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính khách vàng vào ");
        String gender = scanner.nextLine();
        System.out.println("Nhập CCCD,CMND khách hàng vào ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập số điện thoại khách hàng vào ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email khách hàng vào");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng vào");
        String customerType = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(name,date,gender,idCard,phoneNumber,email,customerType,address);
        customer.setId(id);
        listCustomer.add(customer);
        display();
    }
    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer e: listCustomer) {
            if(e.getId() == id) {
                System.out.println("Nhập tên: ");
                e.setName(scanner.nextLine());
                System.out.println("Nhập ngày tháng năm của khách hàng vào ");
                e.setDateOfBirth(scanner.nextLine());
                System.out.println("Nhập giới tính khách vàng vào ");
                e.setGender(scanner.nextLine());
                System.out.println("Nhập CCCD,CMND khách hàng vào ");
                e.setIdCard(scanner.nextLine());
                System.out.println("Nhập số điện thoại khách hàng vào ");
                e.setPhone(scanner.nextLine());
                System.out.println("Nhập Email khách hàng vào");
                e.setEmail(scanner.nextLine());
                System.out.println("Nhập loại khách hàng vào");
                e.setCustomerType(scanner.nextLine());
                System.out.println("Nhập vào địa chỉ khách hàng");
                e.setAddress(scanner.nextLine());
            }
        }
    }
}
