package Exercises.Ex7;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        Client corporate = new CorporateClients();
        Client individual = new IndividualClients();
        Client individual2 = new IndividualClients();
        Account myPersonalDeposit = new DepositAccount(individual,3.4, 1340.0);
        Account myFirmCredit = new CreditAccount(corporate, 4.5, 100000);
        Account myPersonalMortgage = new MortgageAccount(individual2,2.2, 0);

        individual.setName("Petar Petrov");
        individual2.setName("Georgi Georgiev");
        corporate.setName("Firm EOOD");



        System.out.println("The balance before payment is " + myPersonalDeposit.getBalance() + " and after that is " +
                myPersonalDeposit.calculateBalance(100));
        System.out.println("For my personal deposit account the interest is " + myPersonalDeposit.calculateInterest(24));

        System.out.println("The balance before payment is " + myPersonalMortgage.getBalance() + " and after that is " +
                myPersonalMortgage.calculateBalance(200));
        System.out.println("For my personal mortgage account the interest is " + myPersonalMortgage.calculateInterest(16));

        System.out.println("The balance before payment is " + myFirmCredit.getBalance() + " and after that is " +
                myFirmCredit.calculateBalance(80));
        System.out.println("For my firm credit account the interest is " + myFirmCredit.calculateInterest(10));





    }
}
