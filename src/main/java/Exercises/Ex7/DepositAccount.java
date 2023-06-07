package Exercises.Ex7;

public class DepositAccount implements Account{
    private Client client;
    private double monthlyInterestRate;
    private double balance;

    public DepositAccount() {

    }

    public DepositAccount(Client client, double monthlyInterestRate, double balance) {
        this.client = client;
        this.monthlyInterestRate = monthlyInterestRate;
        this.balance = balance;
    }
    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public double getMonthlyInterestRate() {
        return this.monthlyInterestRate;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double calculateBalance(double payment) throws Exception {
        if ((getBalance() <= 0 && payment <= 0) || (payment <= 0 && (payment + getBalance() < 0))) {
            throw new Exception();
        }
        double result = getBalance() + payment;
        return result;
    }

    @Override
    public double calculateInterest(int periodInMonths) {
        if (getBalance() > 0 && getBalance() < 1000) {
            periodInMonths = 0;
        }
        return Account.super.calculateInterest(periodInMonths);
    }
}
