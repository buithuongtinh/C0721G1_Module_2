package _03_mang.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 =new int[5];
        int[] arr2 =new int[5];
        int[] arr3 =new int[10];

        System.out.println("Mảng 1:");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Nhập phần tử thứ " + i + ":");
            arr1[i] = Integer.parseInt(scanner.nextLine());
            arr3[i] = arr1[i];
        }
        System.out.println("Mảng 2:");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Nhập phần tử thứ " + j + ":");
            arr2[j] = Integer.parseInt(scanner.nextLine());
            arr3[arr2.length+j] = arr2[j];
        }
        System.out.print("Mảng array3: ");
        for (int element:arr3) {
            System.out.print(element + " ");
        }
    }
}
