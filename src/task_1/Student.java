package task_1;

public class Student extends Person{
    private double grade;

    public Student(double grade, String name, int age) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >=0 && grade<=10){
            this.grade = grade;
        }
        System.out.println("GRADE ERROR");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", grade=" + grade );
    }
}
