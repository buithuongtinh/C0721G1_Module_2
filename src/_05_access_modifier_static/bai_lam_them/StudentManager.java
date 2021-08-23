package _05_access_modifier_static.bai_lam_them;

import java.util.Scanner;

public class StudentManager {
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student(18,"tinh1");
        studentList[1] = new Student(19,"tinh2");
        studentList[2] = new Student(20,"tinh3");

    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập  tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số nhà");
        String houseNumber = scanner.nextLine();
        System.out.println("nhập tên đường");
        String stress = scanner.nextLine();
        System.out.println("nhập tên phường");
        String ward = scanner.nextLine();
        System.out.println("nhập tên quận");
        String district = scanner.nextLine();
        System.out.println("nhập tên tỉnh");
        String province = scanner.nextLine();
        Address address = new Address(houseNumber,stress,ward,district,province);
        Student student = new Student( age,name,address);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public static void display() {
        for (int i = 0; i < studentList.length - 1; i++) {
            if (studentList[i]!= null)
            System.out.println(studentList[i].toString());
            
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên muốn xóa ");
        String deleteStudent = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getName().equals(deleteStudent)) {
                studentList[i] = null;
                break;
            }
        }
    }

    public static void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên muốn sửa ");
        String nameStudent = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if(nameStudent.equals(studentList[i].getName())){
                System.out.println("Nhập tên mới");
                String newName = scanner.nextLine();
                studentList[i].setName(newName);

                System.out.println("Nhập tuổi mới");
                int newAge = Integer.parseInt(scanner.nextLine());
                studentList[i].setAge(newAge);

                break;
            }
        }
    }
}
