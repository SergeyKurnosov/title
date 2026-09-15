package task_2;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner,balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateYearlyReport() {
        return super.calculateYearlyReport() * (1+(interestRate / 100));
    }
}
