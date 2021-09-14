package _20_case_study_furama_resort.libs;

import java.util.Scanner;

public class Exception {
    public static Scanner sc = new Scanner(System.in);

    public static int choiceNumber() {
        int choice = 0;
        while (true) {
            String str = sc.nextLine();
            if (str.trim().equals("")) {
                System.out.println("Please re-enter:");
                continue;
            }
            try {
                choice = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("You must enter number:");
                continue;
            }
            return choice;
        }
    }
}
