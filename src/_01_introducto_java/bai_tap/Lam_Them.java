package _01_introducto_java.bai_tap;

import java.util.Scanner;

public class Lam_Them {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng Dụng Chuyển Đổi Tiền ");
        while (true){
            System.out.println("Chọn chức năng: ");
            System.out.println("1. đổi từ USD -> VND");
            System.out.println("2. đổi từ VND -> USD ");
            System.out.println("3. Thoát chương trình");
            System.out.println("Chọn chức năng muốn sử dụng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn đổi bao nhiêu tiền USD sang VND: ");
                    double usd = Double.parseDouble(scanner.nextLine());
                    double vnd = usd * 23000;
                    System.out.println("Giá trị VND: "+ vnd);
                    break;
                case 2:
                    System.out.println("Bạn muốn đổi bao nhiêu tiền VND sang tiền USD: ");
                    double vnd2= Double.parseDouble(scanner.nextLine());
                    double usd1  = vnd2 / 23000;
                    System.out.println("Giá trị USD: "+ usd1);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println(" Bạn chọn sai, hãy chọn lại:  ");
            }
        }
    }
}
