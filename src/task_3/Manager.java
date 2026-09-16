package task_3;

public class Manager extends Employe{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double GetBonus() {
        return getBaseSalary()*0.2;
    }
}
