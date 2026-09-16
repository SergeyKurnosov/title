package task_1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.print(getName());
        System.out.println("Гав-гав");
    }
}
