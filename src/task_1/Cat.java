package task_1;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.print(getName());
        System.out.println("Мяу-мяу");
    }
}
