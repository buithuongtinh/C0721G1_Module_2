package _11_stack_queue.bai_tap.optional.to_chuc_du_lieu_hop_li_demerging_su_dung_queue;

public class Student implements Comparable<Student>{
    private String name;
    private String birthday;
    private String gender;
    private int mark;

    public Student() {
    }

    public Student(String name, String birthday, String gender, int mark) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getBirthday().compareTo(o.getBirthday());
    }
}
