package _01_introducto_java.thuc_hanh;

import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Nhập chiều rộng: ");
        width = Float.parseFloat(scanner.nextLine());//Nhập chiều rộng

        System.out.println("Nhập chiều dài: ");
        height = Float.parseFloat(scanner.nextLine());//Nhập chiều dài

        float area = width * height;

        System.out.println("Area is: " + area);
    }

}

