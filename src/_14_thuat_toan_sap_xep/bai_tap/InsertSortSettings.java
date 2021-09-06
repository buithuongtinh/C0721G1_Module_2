package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertSortSettings {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 6, 1, -2, 3, 14, 12};
        System.out.println(insertionSort(arr));
    }

    public static String insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int checkElement = list[i];
            int index = i;
            for (int j = i; j > 0 && checkElement < list[j-1]; j--) {
                list[j] = list[j-1];
                index = j-1;
            }
            list[index] = checkElement;
        }
        return Arrays.toString(list);
    }
}

