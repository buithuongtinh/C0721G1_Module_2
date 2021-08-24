package _07_abstract_class_va_interface.bai_tap.interface_colorable;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String getArea() {
        return "Rectangle area = " + this.width * this.length;
    }

    @Override
    public void resize(double percent) {
        this.width += (percent / 100) * this.width;
        this.length += (percent / 100) * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
