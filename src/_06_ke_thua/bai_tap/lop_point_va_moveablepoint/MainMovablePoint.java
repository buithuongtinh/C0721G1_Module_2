package _06_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint moveAblePoint = new MovablePoint(2,5,4,6);
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
