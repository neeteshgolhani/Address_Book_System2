package com.bridgelabz;
import java.util.*;

public class AddressBook {
    List<Contacts> contactDetails = new ArrayList<>(); // List to store contact details
    Scanner sc = new Scanner(System.in); // Scanner for user input
    Map<String, AddressBook> addressBooks = new HashMap<>(); // Dictionary to store address books
    public void createAddressBook() {
        System.out.println("Enter the name of the new Address Book: ");
        String addressBookName = sc.nextLine();

        if (addressBooks.containsKey(addressBookName)) {
            System.out.println("Address Book with name '" + addressBookName + "' already exists.");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBooks.put(addressBookName, addressBook);
            System.out.println("Address Book '" + addressBookName + "' created.");
        }
    }

    public void addPersonToAddressBook() {
        System.out.println("Enter the name of the Address Book to add a person: ");
        String addressBookName = sc.nextLine();

        AddressBook addressBook = addressBooks.get(addressBookName);
        if (addressBook != null) {
            addressBook.addDetails();
        } else {
            System.out.println("Address Book with name '" + addressBookName + "' does not exist.");
        }
    }

    public void displayAddressBook(String addressBookName) {
        AddressBook addressBook = addressBooks.get(addressBookName);
        if (addressBook != null) {
            System.out.println("Contacts in Address Book '" + addressBookName + "':");
            addressBook.displayContacts();
        } else {
            System.out.println("Address Book with name '" + addressBookName + "' does not exist.");
        }
    }

    public void displayAllAddressBooks() {
        System.out.println("List of Address Books:");
        for (String addressBookName : addressBooks.keySet()) {
            System.out.println("- " + addressBookName);
        }
    }
    public void addDetails() {
        System.out.println("Enter the number of persons you want to add: ");
        int count = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < count; i++) {
            Contacts info = new Contacts();
            System.out.println("Enter first name: "); // Prompt for first name
            info.setFirstName(sc.nextLine()); // Set the first name of the contact
            System.out.println("Enter last name: "); // Prompt for last name
            info.setLastName(sc.nextLine()); // Set the last name of the contact
            System.out.println("Enter address: "); // Prompt for address
            info.setAddress(sc.nextLine()); // Set the address of the contact
            System.out.println("Enter city name: "); // Prompt for city name
            info.setCity(sc.nextLine()); // Set the city of the contact
            System.out.println("Enter state name: "); // Prompt for state name
            info.setState(sc.nextLine()); // Set the state of the contact
            System.out.println("Enter zip code: "); // Prompt for zip code
            info.setZipCode(sc.nextLine()); // Set the zip code of the contact
            System.out.println("Enter contact no.: "); // Prompt for contact number
            info.setContactNo(sc.nextLine()); // Set the contact number of the contact
            System.out.println("Enter email: "); // Prompt for email
            info.setEmail(sc.nextLine()); // Set the email of the contact

            contactDetails.add(info); // Add the contact details to the list
            System.out.println("Person added to the address book.");
            System.out.println("-----------------------------------");
        }
    }

    public void displayContacts() {
        for (Contacts contact : contactDetails) {
            System.out.println(contact);
            System.out.println("-----------------------------------");
        }
    }
}

