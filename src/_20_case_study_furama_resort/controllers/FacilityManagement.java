package _20_case_study_furama_resort.controllers;

import _20_case_study_furama_resort.services.class_service.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayFacilityMenu() {
        while (true) {
            System.out.println("-----Facility Menu-----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
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
                    new FacilityServiceImpl().display();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    break;
                case 4:
                   return;
                default:
                    System.out.println("Please re-enter:");
            }

        }
    }

    private void addMenu() {
        while (true){
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            switch (choice){
                case 1:
                    new FacilityServiceImpl().addNewVilla();
                    break;
                case 2:
                    new FacilityServiceImpl().addNewHouse();
                    break;
                case 3:
                    new FacilityServiceImpl().addNewRoom();
                    break;
                case 4:
                    return;
            }
        }
    }
}
