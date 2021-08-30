package _11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayByStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] array = new int[5];
        array[0] =1;
        array[1] =2;
        array[2] =3;
        array[3] =4;
        array[4] =5;

        for(int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("mảng sau khi push vào stack "+ Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }
        System.out.println("mảng sau khi pop từ stack "+ Arrays.toString(array));
    }
}
