package _20_case_study_furama_resort.controllers;

import _20_case_study_furama_resort.services.class_service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement  {
    private static Scanner scanner = new Scanner(System.in);
    public void displayEmployeesMenu() {
        while (true) {
            System.out.println("-----Employees Menu-----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice:");
            boolean checkLoop = false;
            int choiceSecond = 0;
            while (!checkLoop){
                try {
                    choiceSecond = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Entered wrong, please re-enter");
                }
            }
            switch (choiceSecond) {
                case 1:
                    new EmployeeServiceImpl().display();
                    break;
                case 2:
                    new EmployeeServiceImpl().add();
                    break;
                case 3:
                    new EmployeeServiceImpl().edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
