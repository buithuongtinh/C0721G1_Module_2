package _10_dsa_list.bai_tap.bai_1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(1,"tinh1");
        list.add(2,"tinh2");
        list.add(3,"tinh3");
        list.add(4,"tinh4");
        list.add(5,"tinh5");
        list.add(0,"tinh");
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(Arrays.toString(list.elements));

        //test get():
        System.out.println(list.get(1));
        //test remove():
        list.remove(3);
        System.out.println(list.remove(1));
        System.out.println(list.size());

        //test indexOf(), contains():
        System.out.println(list.indexOf("tinh5"));
        System.out.println(list.contains("tinh4"));
    }
}
