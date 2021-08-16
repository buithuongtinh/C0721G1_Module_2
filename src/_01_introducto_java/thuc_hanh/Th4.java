package _01_introducto_java.thuc_hanh;

import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình");
        System.out.println("Cho phương trình 'a*x + b = c' , nhập hằng số đi :");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
//        double a = scanner.nextDouble();
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("b: ");
//        double b = scanner.nextDouble();
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("c: ");
//        double c = scanner.nextDouble();
        double c = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
