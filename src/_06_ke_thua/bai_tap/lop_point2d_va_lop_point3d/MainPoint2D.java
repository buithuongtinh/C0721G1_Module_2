package _06_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class MainPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2, 3);
//        System.out.println(point2D);
        point2D.setXY(1, 4);
        System.out.println(point2D);
    }
}
