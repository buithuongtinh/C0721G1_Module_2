package _20_case_study_furama_resort.controllers;

import _20_case_study_furama_resort.services.class_service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement  {
    private static final Scanner scanner = new Scanner(System.in);
    public void displayCustomerMenu() {
        while (true) {
            System.out.println("-----Customer Menu-----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice");
            boolean checkLoop = false;
            int choice = 0;
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
                    new CustomerServiceImpl().display();
                    break;
                case 2:
                    new CustomerServiceImpl().add();
                    break;
                case 3:
                    new CustomerServiceImpl().edit();
                    break;
                case 4:
                    return;
//                    new FuramaController().displayMainMenu();
//                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
