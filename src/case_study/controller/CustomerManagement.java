package case_study.controller;

import case_study.services.impl.CustomerServices;

import java.util.Scanner;

public class CustomerManagement {
    public static void displayCustomer() {
        Scanner scanner = new Scanner(System.in);
        CustomerServices customerServices = new CustomerServices();
        do {

            System.out.println("Main Menu");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");

            System.out.println("Nhập vào 1 số");
            int choose = scanner.nextInt();
            if (choose < 1 || choose > 4) {
                System.out.println("Nhập lại số từ 1 đến 4");
                continue;
            }
            switch (choose) {

                case 1:
                    customerServices.display();
                    break;
                case 2:
                    customerServices.add();
                    break;
                case 3:
                    customerServices.edit();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

}
