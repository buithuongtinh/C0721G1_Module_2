package _06_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.6);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.3, "red", 3.6);
        System.out.println(cylinder);
    }
}
