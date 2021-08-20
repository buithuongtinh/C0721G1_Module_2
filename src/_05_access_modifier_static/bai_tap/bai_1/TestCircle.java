package _05_access_modifier_static.bai_tap.bai_1;

import _05_access_modifier_static.bai_tap.bai_1.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(8);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
