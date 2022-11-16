package case_study.controller;

import case_study.services.IEmployeeServices;
import case_study.services.impl.EmployeeServices;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagement {

    public static void displayEmployee() throws IOException {
        Scanner scanner = new Scanner(System.in);
        EmployeeServices employeeServices = new EmployeeServices();

        int choose;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");
            System.out.println("Nhập vào số từ 1 đến 5");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeServices.display();
                    break;
                case 2:
                    employeeServices.add();
                    break;
                case 3:
                    employeeServices.delete();
                    break;
                case 4:
                    employeeServices.edit();
                case 5:
                    return;
                default:
                    System.out.println("Nhập lại số từ 1 đến 5");
            }
        } while (true);

    }
}