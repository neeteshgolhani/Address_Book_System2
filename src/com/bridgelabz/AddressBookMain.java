package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBookSystem = new AddressBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book System Menu:");
            System.out.println("1. Create new Address Book");
            System.out.println("2. Add person to Address Book");
            System.out.println("3. Display Address Book");
            System.out.println("4. Display all Address Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addressBookSystem.createAddressBook(); // Create a new AddressBook
                    break;
                case 2:
                    addressBookSystem.addPersonToAddressBook(); // Add a person to an AddressBook
                    break;
                case 3:
                    System.out.println("Enter the name of the Address Book to display: ");
                    String displayAddressBookName = sc.nextLine();
                    addressBookSystem.displayAddressBook(displayAddressBookName); // Display an AddressBook
                    break;
                case 4:
                    addressBookSystem.displayAllAddressBooks(); // Display all AddressBooks
                    break;
                case 5:
                    System.out.println("Exiting Address Book System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("-----------------------------------");
        }
    }
}