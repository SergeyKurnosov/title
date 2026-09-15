package task_3;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe(){
        System.out.println("name: "+ getName());
        System.out.println("area: "+ area());

    }

    public double area(){
        return 0.0;
    }


}
