package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Add some person entries
        addressBook.addPerson(new Person("Neetesh"));
        addressBook.addPerson(new Person("Arun"));
        addressBook.addPerson(new Person("Kavya"));

        // Sort the entries by name
        addressBook.sortEntriesByName();

        // Print the sorted entries
        addressBook.printEntries();
    }
}