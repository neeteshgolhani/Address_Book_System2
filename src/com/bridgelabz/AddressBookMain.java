package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt the user for input
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        System.out.println("Enter state:");
        String state = scanner.nextLine();

        System.out.println("Enter zip:");
        String zip = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        // create a new Contact instance with the user's input
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        // print the new contact
        System.out.println("New contact created:");
        System.out.println(newContact);
        // create a new address book
        AddressBook addressBook = new AddressBook();
        // add the new contact to the address book
        addressBook.addContact(newContact);

        // print out the current list of contacts in the address book
        System.out.println("Current contacts in address book:");
        for (Contact contact : addressBook.getContacts()) {
            System.out.println(contact);
        }
    }
}