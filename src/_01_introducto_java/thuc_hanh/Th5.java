package _01_introducto_java.thuc_hanh;

import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tháng Bạn muốn đếm ngày ?");
        int thang = Integer.parseInt(scanner.nextLine());

        String ngayTrongThang;
        switch (thang) {
            case 2:
                ngayTrongThang = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngayTrongThang = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngayTrongThang = "30";
                break;
            default:
                ngayTrongThang = "";
        }

        if (!ngayTrongThang.equals("")) System.out.printf("Tháng "+  thang +" có " + ngayTrongThang+" ngày.");
        else System.out.print("Nhập sai !");

    }
}
