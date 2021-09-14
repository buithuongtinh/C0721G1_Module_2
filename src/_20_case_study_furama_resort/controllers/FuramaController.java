package _20_case_study_furama_resort.controllers;

import _20_case_study_furama_resort.libs.Exception;
import _20_case_study_furama_resort.services.class_service.EmployeeServiceImpl;

public class FuramaController extends Exception {


    public static void displayMainMenu() {
        while (true) {
            System.out.println("-----Main Menu-----");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            switch (choiceNumber()) {
                case 1:
                    new EmployeeManagement().displayEmployeesMenu();
                    break;
                case 2:
                    new CustomerManagement().displayCustomerMenu();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }

}
