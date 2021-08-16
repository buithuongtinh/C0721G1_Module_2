package _01_introducto_java.bai_tap;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn muốn đổi bao nhiêu tiền USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double quydoi = usd * 23000;
        System.out.print("Giá trị VND: "+ quydoi);
    }
}
