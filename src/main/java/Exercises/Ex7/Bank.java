package Exercises.Ex7;

import java.util.List;

public interface Bank {
    //void addClient(Client client);
    //void addAccount(Account account);
    List<Client> getClients();
    List<Account> getAccounts();

}
