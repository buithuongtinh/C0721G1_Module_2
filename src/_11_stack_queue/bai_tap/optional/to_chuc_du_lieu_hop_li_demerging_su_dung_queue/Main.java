package _11_stack_queue.bai_tap.optional.to_chuc_du_lieu_hop_li_demerging_su_dung_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Dung", "12/11/1995","Nam", 10));
        list.add(new Student("An", "12/11/1998","Nu", 8));
        list.add(new Student("Hai", "12/11/1991","Nam", 9));
        list.add(new Student("Ngoc", "12/11/1993","Nu", 10));
        list.add(new Student("An", "12/11/1999","Nam", 7));

        System.out.println("List ban dau");
        for (Student student : list) {
            System.out.println(student.toString());
        }

        Collections.sort(list);
        System.out.println("List sau khi sap xep theo ngay sinh");
        for (Student student : list) {
            System.out.println(student.toString());
        }

        NameComparator nameComparator = new NameComparator();
        System.out.println("List sau khi sap xep theo ten");
        list.sort(nameComparator);
        for (Student student : list) {
            System.out.println(student.toString());
        }

        Queue<Student> male = new ArrayDeque<>();
        Queue<Student> female = new ArrayDeque<>();
        ArrayList<Student> listGenderSort = new ArrayList<>();
        for (Student student: list) {
            if (student.getGender().equals("Nu")){
                male.add(student);
            } else {
                female.add(student);
            }
        }
        while (!male.isEmpty()) {
            listGenderSort.add(male.poll());
        }
        while (!female.isEmpty()) {
            listGenderSort.add(female.poll());
        }
        System.out.println("List sap xep theo gioi tinh");
        for (Student student: listGenderSort) {
            System.out.println(student);
        }

    }
}
