package _05_access_modifier_static.bai_tap.bai_2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("john","C04");

        student.setName("Tính");
        student.setClasses("C07");
        System.out.println(student);
    }
}
