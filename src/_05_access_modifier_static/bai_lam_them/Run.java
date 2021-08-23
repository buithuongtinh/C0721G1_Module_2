package _05_access_modifier_static.bai_lam_them;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.delete\n" +
                    "4.edit\n" +
                    "5.Exit");
            System.out.println("Chọn");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentManager.add();
                    break;
                case 2:
                    StudentManager.display();
                    break;
                case 3:
                    StudentManager.delete();
                    break;
                case 4:
                    StudentManager.edit();
                     break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
