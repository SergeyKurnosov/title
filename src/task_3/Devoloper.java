package task_3;

public class Devoloper extends Employe{
    public Devoloper(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double GetBonus() {
        return 15000;
    }
}
