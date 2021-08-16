package _01_introducto_java.thuc_hanh;

import java.util.Scanner;

public class Th6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = Integer.parseInt(scanner.nextLine());
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf( year +" là năm nhuận");
        } else {
            System.out.printf( year+ " ko phải năm nhuận");
        }
    }
}
