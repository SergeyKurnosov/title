package task4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(char type, double width, double height) {
        super(type);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
