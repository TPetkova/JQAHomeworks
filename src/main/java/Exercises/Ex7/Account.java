package Exercises.Ex7;

import java.text.DecimalFormat;

public interface Account {
    Client getClient();
    double getMonthlyInterestRate();
    double getBalance();
    void setClient(Client client);
    void setMonthlyInterestRate(double monthlyInterestRate);
    void setBalance(double balance);
    double calculateBalance(double payment) throws Exception;
    default double calculateInterest(int periodInMonths) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String resultString = decimalFormat.format(periodInMonths * (this.getMonthlyInterestRate() / 100));
        double result = Double.parseDouble(resultString);
        return result;
    }
    
}
