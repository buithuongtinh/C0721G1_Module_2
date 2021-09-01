package _11_stack_queue.bai_tap.optional.to_chuc_du_lieu_hop_li_demerging_su_dung_queue;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getBirthday().compareTo(o2.getBirthday());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
