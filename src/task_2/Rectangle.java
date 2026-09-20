package task_2;

public record Rectangle (double width, double height) implements Shape{
   public Rectangle {
        if(width < 0 || height < 0){
            throw new IllegalArgumentException("нельзя меньше 0");
        }
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 2*(width+height);
    }

    static Rectangle square(double side){
        return new Rectangle(side , side);
    }

}
