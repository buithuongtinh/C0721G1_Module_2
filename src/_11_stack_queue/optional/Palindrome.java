package _11_stack_queue.optional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Queue queue = new LinkedList();
        for (int i = input.length()-1; i >= 0 ; i--){
            queue.add(input.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString + queue.remove();
        }
        if(input.equals(reverseString))
            System.out.println("Đây là chuổi đối xứng .");
        else
            System.out.println("Đây ko phải chuổi đối xứng.");
    }
}
