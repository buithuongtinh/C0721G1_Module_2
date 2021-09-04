package _13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = input.nextLine();

        LinkedList<Character> result = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                }
            }
            if (tempList.size() > result.size()) {
                result.clear();
                result.addAll(tempList);
            }
            tempList.clear();
        }

        for (Character ch : result) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
