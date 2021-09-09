package _17_binary_file.thuc_hanh.th_2;

import _17_binary_file.thuc_hanh.th_2.ReadAndWrite;
import _17_binary_file.thuc_hanh.th_2.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Lê Văn Quyết", "Quảng Nam"));
        students.add(new Student(2, "Nguyễn Thị Hạnh", "Quảng Trị"));
        students.add(new Student(3, "Lê Thị Mỹ Linh", "Đà Nẵng"));
        students.add(new Student(4, "Phạm Nhật Vượng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Phục", "Huế"));

        ReadAndWrite.writeToFile("src\\_17_binary_file\\thuc_hanh\\th_2\\student.csv",students);
        List<Student> studentDataFromFile = ReadAndWrite.readDataFromFile("src\\_17_binary_file\\thuc_hanh\\th_2\\student.csv");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
