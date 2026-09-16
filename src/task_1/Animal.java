package task_1;

public abstract class Animal {
private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void makeSound();
    public void sleep(){
        System.out.println("Спит");
    }
}
