package _20_case_study_furama_resort.controllers;

import java.util.Scanner;

public class FuramaController {

    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu(){
        System.out.println("Welcome to Furama Resort menu: ");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
        System.out.println("Please enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        do{
            switch (choice){
                case 1:{
                    System.out.println("1.Employee Management");
                    System.out.println(
                            "1:Display list employees\n" +
                            "2:Add new employee\n" +
                            "3:Edit employee\n" +
                            "4:Return main menu\n");
                    break;}
                case 2:{
                    System.out.println("2.Customer Management");
                    System.out.println(
                            "1:Display list customers\n" +
                            "2:Add new customer\n" +
                            "3:Edit customer\n" +
                            "4:Return main menu\n");
                    break;}
                case 3:{
                    System.out.println("3.Facility Management ");
                    System.out.println(
                            "1:Display list facility\n" +
                            "2:Add new facility\n" +
                            "3:Display list facility maintenance\n" +
                            "4:Return main menu\n");
                    break;}
                case 4:{
                    System.out.println("4.Booking Management");
                    System.out.println(
                            "1:Add new booking\n" +
                            "2:Display list booking\n" +
                            "3:Create new constracts\n" +
                            "4:Display list contracts\n" +
                            "5:Edit contracts\n" +
                            "6:Return main menu\n");
                    break;}
                case 5:{
                    System.out.println("5.Promotion Management");
                    System.out.println(
                            "1:Display list customers use service\n" +
                            "2:Display list customers get voucher\n" +
                            "3:Return main menu\n");
                    break;}
                case 6:
                    System.exit(-1);
                default:
                    System.out.println("Please enter from 1 to 6:");
            }

        }while (true);
    }
}
