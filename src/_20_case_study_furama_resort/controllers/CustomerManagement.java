package _20_case_study_furama_resort.controllers;

import _20_case_study_furama_resort.libs.Exception;
import _20_case_study_furama_resort.services.class_service.CustomerServiceImpl;

public class CustomerManagement extends Exception {
    public void displayCustomerMenu() {
        while (true) {
            System.out.println("-----Customer Menu-----");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice");
            switch (choiceNumber()) {
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
                    new FuramaController().displayMainMenu();
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
