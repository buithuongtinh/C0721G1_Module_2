package _01_introducto_java.bai_tap;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        System.out.println("Nhập Tên của bạn : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
