package _07_abstract_class_va_interface.bai_tap.interface_colorable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return "Circle Area = " + this.radius * this.radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius += (percent / 100) * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

