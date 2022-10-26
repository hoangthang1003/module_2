package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        new MainMenu().displayMainMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        do {
            int choose = scanner.nextInt();

            if (choose < 1 || choose > 6) {
                System.out.println("Nhập lại số từ 1 đến 6");
                continue;
            }
            switch (choose) {

                case 1:
                    new EmployeeManagement().displayEmployee();
                    break;
                case 2:
                    new CustomerManagement().displayCustomer();
                    break;
                case 3:
                    new FacilityManagement().displayFacility();
                    break;
                case 4:
                    new BookingManagement().displayBooking();
                    break;
                case 5:
                    new PromotionManagement().displayPromotion();
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }









}
