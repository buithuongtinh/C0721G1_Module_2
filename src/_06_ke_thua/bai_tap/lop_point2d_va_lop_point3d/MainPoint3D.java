package _06_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        point3D.setXYZ(2, 4, 6);
        System.out.println(point3D);
    }
}
