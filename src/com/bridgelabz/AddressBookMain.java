package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Person");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addressBook.addDetails(); // Add a person to the address book
                    break;
                case 2:
                    addressBook.displayContacts(); // Display the contacts in the address book
                    break;
                case 3:
                    System.out.println("Exiting Address Book.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("-----------------------------------");
        }
    }
}
