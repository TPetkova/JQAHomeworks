package Exercises.Ex7;

public class MortgageAccount implements Account{
    private Client client;
    private double monthlyInterestRate;
    private double balance;

    public MortgageAccount() {

    }

    public MortgageAccount(Client client, double monthlyInterestRate, double balance) {
        this.client = client;
        this.monthlyInterestRate = monthlyInterestRate;
        this.balance = balance;
    }

    @Override
    public Client getClient() {
        return this.client;
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
        if (payment <= 0) {
            throw new Exception();
        }
        double result = getBalance() + payment;
        return result;
    }

    @Override
    public double calculateInterest(int periodInMonths) {
        double newInterest = 0;
        if (client instanceof IndividualClients) {
            periodInMonths = periodInMonths - 6;
            System.out.println("For the first 6 months the interest will be 0, and after that will be: "
                    + Account.super.calculateInterest(periodInMonths));
        } else if (client instanceof CorporateClients) {
            if (periodInMonths > 12) {
                newInterest = (Account.super.calculateInterest(periodInMonths)) * 0.5;
                System.out.printf("For the first 12 months the interest will be: " + newInterest  +
                        " and for the period left the interest will be: " +
                        Account.super.calculateInterest(periodInMonths));
            }
        }

        return Account.super.calculateInterest(periodInMonths);
    }
}
