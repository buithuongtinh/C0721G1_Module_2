package _07_abstract_class_va_interface.thuc_hanh.interface_comparable;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Một hình có màu "
                + getColor()
                + " và "
                + (isFilled() ? "lấp đầy" : "không lấp đầy");
    }

}

