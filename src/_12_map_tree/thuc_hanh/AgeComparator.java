package _12_map_tree.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }else if (o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Students student = new Students("Kien", 30, "HT");
        Students student1 = new Students("Nam", 26, "HN");
        Students student2 = new Students("Anh", 39, "HT" );
        Students student3 = new Students("Tung", 38, "HT" );

        List<Students> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Students st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Students st : lists){
            System.out.println(st.toString());
        }
    }
}

