package task_2;

public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("радиус: "+radius+"\n" +
                "диаметр: "+2*radius+"\n"+
                "длина окружности: "+ (2*radius)*Math.PI+"\n"+
                "площадь: "+ (Math.pow(radius,2))*Math.PI);
    }
}
