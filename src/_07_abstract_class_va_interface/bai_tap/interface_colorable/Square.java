package _07_abstract_class_va_interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable {
    double side = 0;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getArea() {
        return "Square area = " + this.side * this.side ;
    }

    @Override
    public void resize(double percent) {
        this.side += (percent / 100) * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
