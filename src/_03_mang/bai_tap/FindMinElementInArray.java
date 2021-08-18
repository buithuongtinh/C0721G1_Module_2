package _03_mang.bai_tap;

import java.util.Scanner;

public class FindMinElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array[" + i + "]:");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
