package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println("initialize values of array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element" + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array before sort: " + Arrays.toString(arr));
        insertionSort(arr);

    }

    private static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentValue = list[i];
            int index = i;
            System.out.println("currentValue: " + currentValue + " at index: " + index);
            while (index > 0 && currentValue < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = currentValue;
            System.out.println("List after the  " + i + " times sort: " + Arrays.toString(list) + "\n");
        }
    }
}
