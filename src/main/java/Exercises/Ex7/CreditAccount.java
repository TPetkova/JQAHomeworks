package Exercises.Ex7;

public class CreditAccount implements Account{
    private Client client;
    private double monthlyInterestRate;
    private double balance;

    public CreditAccount() {

    }

    public CreditAccount(Client client, double monthlyInterestRate, double balance) {
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
        return monthlyInterestRate;
    }

    @Override
    public double getBalance() {
        return balance;
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
        if (payment <= 0) {
            throw new Exception();
        }
        double result = getBalance() + payment;
        return result;
    }

    @Override
    public double calculateInterest(int periodInMonths) {
        if (client instanceof IndividualClients) {
            periodInMonths = periodInMonths- 3;
            System.out.println("There will be no interest for the first 3 months " +
                    "and after that the interest will be: " + Account.super.calculateInterest(periodInMonths));
        } else if (client instanceof CorporateClients) {
            periodInMonths = periodInMonths - 2;
            System.out.println("There will be no interest for the first 2 months " +
                    "and after that the interest will be: " + Account.super.calculateInterest(periodInMonths));
        }
        return Account.super.calculateInterest(periodInMonths);
    }

}
