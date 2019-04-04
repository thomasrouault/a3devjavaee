package fr.imie.contact.repositories;

import fr.imie.contact.entities.BankAccount;
import fr.imie.contact.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){

        Person p = new Person();

        p.addAccounts(new BankAccount());
    }
}
