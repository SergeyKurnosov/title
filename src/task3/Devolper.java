package task3;

public class Devolper extends Employee{
    public Devolper(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return getBaseSalary()+15000;
    }
}
