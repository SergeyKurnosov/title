public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная сумма пополнения");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Нулевая сумма списания");
        } else if (this.balance < amount) {
            System.out.println("Недостаточно средств для списания");
        } else {
            this.balance -= amount;
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
