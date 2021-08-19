package _04_lop_va_doi_tuong_trong_java.bai_tap.class_fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.turnOn();
        fan1.setColor("Yellow");
        System.out.println(fan1.toString());

        fan2.turnOff();
        System.out.println(fan2.toString());
    }
}
