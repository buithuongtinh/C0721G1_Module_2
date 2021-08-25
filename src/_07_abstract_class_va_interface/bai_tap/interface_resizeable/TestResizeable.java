package _07_abstract_class_va_interface.bai_tap.interface_resizeable;


public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(5, 8);
        shapes[2] = new Square(10);
        //re-size before:
        System.out.println("re-size before:");
        for (Shape element : shapes) {
            System.out.println(element.toString());
        }
        //re-size
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.floor(Math.random() * 100 + 1));
        }
        //re-sized after:
        System.out.println("\n re-sized after:");
        for (Shape element : shapes) {
            System.out.println(element.toString());
        }
    }
}
