package _20_case_study_furama_resort.controllers;

import java.util.Scanner;

public class FuramaController  {
    public static Scanner scanner = new Scanner(System.in);

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
            int choice = 0;
            boolean checkLoop = false;
            while (!checkLoop){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Entered wrong, please re-enter");
                }
            }
            switch (choice) {
                case 1:
                    new EmployeeManagement().displayEmployeesMenu();
                    break;
                case 2:
                    new CustomerManagement().displayCustomerMenu();
                    break;
                case 3:
                    new FacilityManagement().displayFacilityMenu();
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
