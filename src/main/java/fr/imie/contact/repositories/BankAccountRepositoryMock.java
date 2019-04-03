package fr.imie.contact.repositories;

import fr.imie.contact.entities.BankAccount;
import fr.imie.contact.entities.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccountRepositoryMock extends BankAccountRepository{

    private List bankaccounts = new ArrayList();

    public BankAccountRepositoryMock() {
        //save(new BankAccount(new BigDecimal (5001)  , new Person("Jean", "Michel")));
        //save(new BankAccount(new BigDecimal (12547), new Person("Arthur", "Luke")));
        //save(new BankAccount(5001, ("Jean", "Alain")));
    }

    public List<BankAccount> findAll() {
        return bankaccounts;
    }

    public void save(BankAccount bankaccount) {
        bankaccounts.add(bankaccount);
    }

}
