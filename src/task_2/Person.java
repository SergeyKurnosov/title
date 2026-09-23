package task_2;


import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(obj instanceof Person){
            return this.age == ((Person) obj).age && this.name.equals(((Person) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
