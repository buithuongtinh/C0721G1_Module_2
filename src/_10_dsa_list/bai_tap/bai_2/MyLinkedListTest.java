package _10_dsa_list.bai_tap.bai_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Minh");
        myLinkedList.addLast("Hoàng");
        myLinkedList.add(0, "Phong");
        myLinkedList.add(1, "Nam");
        myLinkedList.add(3, "Quân");
        myLinkedList.add(4, "Danh");
        myLinkedList.add(5, "Lâm");

        System.out.println("Các phần tử có trong list là: ");
        myLinkedList.printList();
        myLinkedList.size();
            // check xem có tồn tại trong lick ko, trả về true false
        System.out.println(myLinkedList.contains("Phong"));





    }


}
