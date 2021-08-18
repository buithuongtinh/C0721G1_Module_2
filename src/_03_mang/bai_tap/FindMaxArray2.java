package _03_mang.bai_tap;

import java.util.Scanner;

public class FindMaxArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter colum:");
        int colum = Integer.parseInt(sc.nextLine());
        System.out.println("Enter row:");
        int row = Integer.parseInt(sc.nextLine());
        float[][] array = new float[colum][row];
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++){
                System.out.println("Enter element array[" + i + "][" + j + "]:");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        float max = array[0][0];
        int elment = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    elment = i;
                    index = j;
                }
            }
        }
        System.out.println("Max = " + max + " phần tử thứ " + elment + " vị trí thứ " + index);
    }
}
