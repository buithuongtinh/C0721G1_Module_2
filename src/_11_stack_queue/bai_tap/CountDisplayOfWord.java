package _11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountDisplayOfWord {
    public static void main(String[] args) {
        TreeMap<String,Integer> stringTree = new TreeMap<String,Integer>();
        String str = "  Tôi tên là     Nguyễn Văn A, tôi   học lớp   C0721G1   ";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++) {
            if (!arr[i].equals("")) {
                String word = arr[i].toUpperCase();
                if(!stringTree.containsKey(word)) {
                    stringTree.put(word,1);
                }else {
                    int countValue = stringTree.get(word) + 1;
                    stringTree.put(word,countValue);
                }
            }
        }
        for (Map.Entry<String,Integer> string: stringTree.entrySet()) {
            System.out.println(string.getKey() + ": " + string.getValue());
        }
    }
}
