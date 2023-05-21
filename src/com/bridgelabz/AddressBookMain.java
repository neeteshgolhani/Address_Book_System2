package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Add some person entries
        addressBook.addPerson(new Person("Neetesh", "Jabalpur", "MP", "11111"));
        addressBook.addPerson(new Person("Anya", "Lakhnadon", "CG", "22222"));
        addressBook.addPerson(new Person("Raghav", "Bangelore", "KA", "33333"));

        // Sort the entries by city, state, or zip
        addressBook.sortEntriesByCity();

        // Print the sorted entries
        addressBook.printEntries();
    }
}