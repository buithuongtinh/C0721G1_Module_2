package _03_mang.bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số phần tử:");
            size = Integer.parseInt(sc.nextLine());
            if (size >= 10) {
                System.out.println("Size phải bé hơn 10");
            }
        } while (size >= 10);
        int[] array = new int[10];
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ":");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Nhập Phần tử muốn xóa:");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
                for (int j = i; j <= size - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
            }
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}
