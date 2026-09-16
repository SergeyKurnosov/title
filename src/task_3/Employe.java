package task_3;

public abstract class Employe implements Payable {
    private String name;
    private double baseSalary;

    public Employe(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double GetBonus();

    @Override
    public double calculatePay() {
        return baseSalary + GetBonus();
    }
}
