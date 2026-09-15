package task_2;

public class CheckingAccount extends BankAccount{
    private double overdraftFee;
    public CheckingAccount(String owner, double balance,double overdraftFee) {
        super(owner, balance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public double calculateYearlyReport() {
        if(super.calculateYearlyReport() >= overdraftFee){
            return super.calculateYearlyReport()-overdraftFee;
        }
        else {
            return 0.0;
        }

    }
}
