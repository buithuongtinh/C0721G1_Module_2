package bai_lam_them_fix_bug;

import java.util.Scanner;



public class Run {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.Exti");
            System.out.println("Chọn");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                   // code thêm mới
                    StudentManager.add();
                    break;
                case 2:
                    // hiện thị
                    StudentManager.display();
                    break;

            }
        }
    }
}
