package fr.imie.contact.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class BankAccount {

    @Id @GeneratedValue
    private Integer id;

    private BigDecimal balance;

    //private Person owner;

    public BankAccount() {
    }

    /*public BankAccount(BigDecimal balance, Person owner) {
        this.balance = balance;
        this.owner = owner;
    }*/

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /*public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }*/
}
