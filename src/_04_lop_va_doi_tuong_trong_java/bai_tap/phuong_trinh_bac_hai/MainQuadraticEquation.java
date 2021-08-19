package _04_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.getRoot();
    }
}
