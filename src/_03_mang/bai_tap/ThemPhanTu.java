package _03_mang.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
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
        int array[] = new int[10];
        for (int i = 0; i < size; i++){
            System.out.print("Phần tử thứ " + i + ":");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Nhập giá trị muốn thêm :");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = size-1; i >= index; i--) {
            array[i+1] = array[i];
            if (i == index) {
                array[i] = number;
            }
        }
        for (int element:array) {
            System.out.print(element + " ");
        }
    }
}
