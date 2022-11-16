package case_study.controller;

import case_study.services.impl.EmployeeServices;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuController {
    public void displayMainMenu() throws IOException {

        do {

            System.out.println("Main Menu");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào 1 số");
            int choose = scanner.nextInt();
            if (choose < 1 || choose > 6) {
                System.out.println("Nhập lại số từ 1 đến 6");
                continue;
            }
            switch (choose) {

                case 1:
                    EmployeeManagement.displayEmployee();
                    break;
                case 2:
                    CustomerManagement.displayCustomer();
                    break;
                case 3:
                    FacilityManagement.displayFacility();
                    break;
                case 4:
                    BookingManagement.displayBooking();
                    break;
                case 5:
                    PromotionManagement.displayPromotion();
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
